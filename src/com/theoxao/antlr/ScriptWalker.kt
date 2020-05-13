package com.theoxao.antlr

import com.google.common.base.CaseFormat
import com.theoxao.antlr.autogen.JavaLexer
import com.theoxao.antlr.autogen.JavaParser
import com.theoxao.antlr.autogen.JavaParserBaseListener
import com.theoxao.antlr.model.*
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.DefaultErrorStrategy
import org.antlr.v4.runtime.tree.ParseTreeWalker

/**
 * @author theo
 * @date 2020/4/27
 */

fun <T, R> preParse(
    text: String?,
    listenerProvider: () -> T,
    callback: (T) -> R?
): R? where T : JavaParserBaseListener {
    if (text == null) {
        return null
    }
    val stream = ANTLRInputStream(text)
    val lexer = JavaLexer(stream)
    val tokenStream = CommonTokenStream(lexer)
    val javaParser = JavaParser(tokenStream)
    javaParser.removeErrorListeners()
    javaParser.errorHandler = DefaultErrorStrategy()
    val compilationUnit = javaParser.compilationUnit()
    val listener = listenerProvider()
    ParseTreeWalker.DEFAULT.walk(listener, compilationUnit)
    return callback(listener)
}

const val identity = "Identity"
const val uniqueKey = "UniqueKey"
const val foreignKey = "ForeignKey"

class TableWalker(private val commitId: String, private val schema: String?) : JavaParserBaseListener() {

    private var columns: MutableList<Column> = mutableListOf()

    private var tableName: String = ""

    private val indexes = mutableListOf<Key>()

    override fun enterFieldDeclaration(ctx: JavaParser.FieldDeclarationContext) {
        if (ctx.typeType().classOrInterfaceType()?.IDENTIFIER(0)?.text == "TableField") {
            val vdc = ctx.variableDeclarators().variableDeclarator(0)
            val mc = vdc.variableInitializer().expression().methodCall()
            val elc = mc.children[2] as JavaParser.ExpressionListContext
            val columnName = elc.expression(0).text.replace("\"", "")
            val comment = elc.expression(3)?.text ?: ""
            val column = Column(commitId, columnName, comment)
            val dataTypeEc = elc.expression(1) as JavaParser.ExpressionContext
            dataTypeEc.dataType(column)
            column.dataType = dataTypeEc.dataType()
            columns.add(column)
        }
    }

    fun JavaParser.ExpressionContext.dataType(): String {
        val fc = this.getChild(0)
        if (this.getChild(2) is JavaParser.MethodCallContext && fc is JavaParser.ExpressionContext) {
            return fc.dataType()
        }
        return this.getChild(2).text
    }


    override fun enterConstructorDeclaration(ctx: JavaParser.ConstructorDeclarationContext) {
        val name = ctx.constructorBody?.blockStatement(0)?.statement()?.expression()?.methodCall()?.expressionList()
            ?.expression(0)?.text ?: ""
        if (name != "alias") this.tableName = name.replace("\"", "")
    }

    private fun JavaParser.ExpressionContext.dataType(column: Column) {
        val node1 = this.getChild(0) as JavaParser.ExpressionContext
        val node3 = this.getChild(2)
        if (node3 is JavaParser.MethodCallContext) {
            val methodName = node3.IDENTIFIER().text
            column.initProperty(methodName, node3.getChild(2))
            node1.dataType(column)
        } else {
            column.dataType = this.text
        }
    }

    //walk for indexes
    override fun enterClassDeclaration(ctx: JavaParser.ClassDeclarationContext) {
        if (ctx.typeType()?.classOrInterfaceType()?.text != "AbstractIndex") return
        ctx.classBody().classBodyDeclaration()?.forEach { cbd ->
            val fd = cbd.memberDeclaration().fieldDeclaration()
            val keyType = fd.typeType().classOrInterfaceType().IDENTIFIER(0)
            val vd = fd.variableDeclarators().variableDeclarator(0)
            val keyId = vd.variableDeclaratorId().IDENTIFIER().text
            val el = vd.variableInitializer().expression().methodCall().expressionList()
            val tableName = el.expression(0).text.replace("\"", "")
            val indexName = el.expression(1).text.replace("\"", "")
            val columns = el.expression().filterIndexed { index, _ -> index > 1 }
                .map { it.text.replace("\"", "") }
            indexes.add(IndexKey(commitId, tableName, indexName, columns))
        }
    }

    fun emit(): Table {
        return Table(commitId, schema, tableName, columns, indexes)
    }
}

class KeyWalker(private val commitId: String) : JavaParserBaseListener() {

    private val identityKeys = mutableListOf<IdentityKey>()
    private val uniqueKeys = mutableListOf<UniqueKey>()
    private val foreignKeys = mutableListOf<ForeignKey>()

    fun emit(): MutableList<Key> {
        val result = mutableListOf<Key>()
        result.addAll(identityKeys)
        result.addAll(uniqueKeys)
        result.addAll(foreignKeys)
        return result;
    }

    override fun enterClassDeclaration(ctx: JavaParser.ClassDeclarationContext) {
        if (ctx.typeType()?.classOrInterfaceType()?.text != "AbstractKeys") return
        ctx.classBody().classBodyDeclaration().forEach {
            val fd = it.memberDeclaration().fieldDeclaration()
            val keyType = fd.typeType().classOrInterfaceType().IDENTIFIER(0).text
            val vd = fd.variableDeclarators().variableDeclarator(0)
            val keyId = vd.variableDeclaratorId().IDENTIFIER().text
            val el = vd.variableInitializer().expression().methodCall().expressionList()
            when (keyType) {
                identity -> {
                    val tableName = el.expression(0).getChild(2).text.toLowerCase()
                    val fieldName = el.expression(1).getChild(2).text.toLowerCase()
                    identityKeys.add(IdentityKey(commitId, keyId, tableName, fieldName))
                }
                uniqueKey -> {
                    val tableName = el.expression(0).getChild(2).text.toLowerCase()
                    val keyName = el.expression(1).primary().text.toLowerCase().replace("\"", "")
                    val columns = el.expression().subList(2, el.expression().size).map { ec ->
                        ec.getChild(2).text.toLowerCase()
                    }.toTypedArray()
                    uniqueKeys.add(UniqueKey(commitId, keyId, tableName, keyName, columns))
                }
                foreignKey -> {
                    val refKeyId = el.expression(0).getChild(2).text
                    val tableName = el.expression(1).getChild(2).text.toLowerCase()
                    val keyName = el.expression(2).primary().text.toLowerCase().replace("\"", "")
                    val fieldName = el.expression(3).getChild(2).text.toLowerCase()
                    foreignKeys.add(ForeignKey(commitId, keyId, refKeyId, tableName, keyName, fieldName))
                }
            }
        }
    }
}

class EnumWalker(commitId: String) : JavaParserBaseListener() {

    lateinit var enumName: String

    lateinit var enums: List<String>

    override fun enterEnumDeclaration(ctx: JavaParser.EnumDeclarationContext) {
        this.enumName = ctx.IDENTIFIER().text.replace("_", "")
    }

    override fun enterEnumConstants(ctx: JavaParser.EnumConstantsContext) {
        enums = ctx.enumConstant().map {
            it.IDENTIFIER().text
        }
    }

    fun emit(): Pair<String, List<String>> {
        return enumName to enums
    }

}
