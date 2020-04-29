package com.theoxao.antlr

import com.theoxao.antlr.autogen.JavaLexer
import com.theoxao.antlr.autogen.JavaParser
import com.theoxao.antlr.autogen.JavaParserBaseListener
import com.theoxao.antlr.model.*
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.DefaultErrorStrategy
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.litote.kmongo.index

/**
 * @author theo
 * @date 2020/4/27
 */

fun preParse(
    text: String,
    listenerProvider: () -> JavaParserBaseListener,
    callback: (JavaParserBaseListener) -> Any
) {
    val stream = ANTLRInputStream(text)
    val lexer = JavaLexer(stream)
    val tokenStream = CommonTokenStream(lexer)
    val javaParser = JavaParser(tokenStream)
    javaParser.removeErrorListeners()
    javaParser.errorHandler = DefaultErrorStrategy()
    val compilationUnit = javaParser.compilationUnit()
    val listener = listenerProvider()
    ParseTreeWalker.DEFAULT.walk(listener, compilationUnit)
    callback(listener)
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

    override fun emmit(): Definition {
        return Table(commitId, "to do schema", tableName, columns, indexes)
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
}

class KeyWalker(private val commitId: String) : JavaParserBaseListener() {

    private val identityKeys = mutableListOf<IdentityKey>()
    private val uniqueKeys = mutableListOf<UniqueKey>()
    private val foreignKeys = mutableListOf<ForeignKey>()

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
        println("halt")
    }

    override fun emmit(): Map<String, List<Key>> {
        return mapOf(
            identity to identityKeys,
            uniqueKey to uniqueKeys,
            foreignKey to foreignKeys
        )

    }
}
