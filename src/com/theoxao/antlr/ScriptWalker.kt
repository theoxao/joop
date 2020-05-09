package com.theoxao.antlr

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

class TableWalker(private val commitId: String) : JavaParserBaseListener() {

    private var columns: MutableList<Column> = mutableListOf()

    private var tableName: String = ""

    private val indexes = mutableListOf<IndexKey>()

    override fun enterFieldDeclaration(ctx: JavaParser.FieldDeclarationContext) {
        if (ctx.typeType().classOrInterfaceType().IDENTIFIER(0).text == "TableField") {
            val vdc = ctx.variableDeclarators().variableDeclarator(0)
            val mc = vdc.variableInitializer().expression().methodCall()
            val elc = mc.children[2] as JavaParser.ExpressionListContext
            val columnName = elc.expression(0).text.replace("\"", "")
            val comment = elc.expression(3)?.text ?: ""
            val column = Column(commitId, columnName, comment)
            val dataTypeEc = elc.expression(1) as JavaParser.ExpressionContext
            dataTypeEc.dataType(column)
            val dataTypeName = dataTypeEc.getChild(0).getChild(0).text
            column.dataType = dataTypeName
            columns.add(column)
        }
    }

    override fun enterConstructorDeclaration(ctx: JavaParser.ConstructorDeclarationContext) {
        this.tableName =
            ctx.constructorBody?.blockStatement(0)?.statement()?.expression()?.methodCall()?.expressionList()
                ?.expression(0)?.text ?: ""
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
        ctx.classBody().classBodyDeclaration().firstOrNull()?.let { cbd ->
            val fd = cbd.memberDeclaration().fieldDeclaration()
            val keyType = fd.typeType().classOrInterfaceType().IDENTIFIER(0)
            val vd = fd.variableDeclarators().variableDeclarator(0)
            val keyId = vd.variableDeclaratorId().IDENTIFIER().text
            val el = vd.variableInitializer().expression().methodCall().expressionList()
            val tableName = el.expression(0).IDENTIFIER().text
            val indexName = el.expression(1).IDENTIFIER().text
            val columns = el.expression().filterIndexed { index, _ -> index > 1 }
                .map { it.IDENTIFIER().text }
            indexes.add(IndexKey(commitId, tableName, indexName, columns))
        }
    }

    fun emit(): Table {
        TODO()
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
                    val keyName = el.expression(1).primary().text
                    val columns = el.expression().subList(2, el.expression().size).map { ec ->
                        ec.getChild(2).text.toLowerCase()
                    }.toTypedArray()
                    uniqueKeys.add(UniqueKey(commitId, keyId, tableName, keyName, columns))
                }
                foreignKey -> {
                    val refKeyId = el.expression(0).getChild(2).text
                    val tableName = el.expression(1).getChild(2).text
                    val keyName = el.expression(2).primary().text
                    val fieldName = el.expression(3).getChild(2).text
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
        this.enumName = ctx.IDENTIFIER().text
    }

    override fun enterEnumConstants(ctx: JavaParser.EnumConstantsContext) {
        enums = ctx.enumConstant().map {
            it.IDENTIFIER().text
        }
    }

}
