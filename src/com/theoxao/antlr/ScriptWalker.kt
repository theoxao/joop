package com.theoxao.antlr

import com.theoxao.antlr.autogen.JavaLexer
import com.theoxao.antlr.autogen.JavaParser
import com.theoxao.antlr.autogen.JavaParserBaseListener
import com.theoxao.antlr.model.Column
import com.theoxao.antlr.model.ForeignKey
import com.theoxao.antlr.model.IdentityKey
import com.theoxao.antlr.model.UniqueKey
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker

/**
 * @author theo
 * @date 2020/4/27
 */

fun preParse(text: String, listenerProvider: (TokenStream) -> KeyWalker) {
    val stream = ANTLRInputStream(text)
    val lexer = JavaLexer(stream)
    val tokenStream = CommonTokenStream(lexer)
    val javaParser = JavaParser(tokenStream)
    javaParser.removeErrorListeners()
    javaParser.errorHandler = DefaultErrorStrategy()
    val compilationUnit = javaParser.compilationUnit()
    val listener = listenerProvider(tokenStream)
    ParseTreeWalker.DEFAULT.walk(listener, compilationUnit)
}


class TableWalker(tokenStream: TokenStream) : JavaParserBaseListener() {

    var writer: TokenStreamRewriter = TokenStreamRewriter(tokenStream)


    var columns: MutableList<Column> = mutableListOf()

    var tableName: String? = null

    override fun enterFieldDeclaration(ctx: JavaParser.FieldDeclarationContext) {
        if (ctx.typeType().classOrInterfaceType().IDENTIFIER(0).text == "TableField") {
            val column = Column()
            val vdc = ctx.variableDeclarators().variableDeclarator(0)
            val mc = vdc.variableInitializer().expression().methodCall()
            val elc = mc.children[2] as JavaParser.ExpressionListContext
            val columnName = elc.expression(0).text.replace("\"", "")
            column.name = columnName
            val dataTypeEc = elc.expression(1) as JavaParser.ExpressionContext
            dataTypeEc.dataType(column)
            val dataTypeName = dataTypeEc.getChild(0).getChild(0).text
            column.dataType = dataTypeName
            val comment = elc.expression(3).text
            column.comment = comment
            columns.add(column)
        }
    }

    override fun enterConstructorDeclaration(ctx: JavaParser.ConstructorDeclarationContext) {
        this.tableName =
            ctx.constructorBody?.blockStatement(0)?.statement()?.expression()?.methodCall()?.expressionList()
                ?.expression(0)?.text
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


}


class KeyWalker(tokenStream: TokenStream) : JavaParserBaseListener() {

    val identityKeys = mutableListOf<IdentityKey>()
    val uniqueKeys = mutableListOf<UniqueKey>()
    val foreignKeys = mutableListOf<ForeignKey>()

    override fun enterClassDeclaration(ctx: JavaParser.ClassDeclarationContext) {
        if (ctx.typeType().classOrInterfaceType().text != "AbstractKeys") return
        ctx.classBody().classBodyDeclaration().forEach {
            val fd = it.memberDeclaration().fieldDeclaration()
            val keyType = fd.typeType().classOrInterfaceType().IDENTIFIER(0).text
            val vd = fd.variableDeclarators().variableDeclarator(0)
            val keyId = vd.variableDeclaratorId().IDENTIFIER().text
            val el = vd.variableInitializer().expression().methodCall().expressionList()
            when (keyType) {
                "Identity" -> {
                }
                "UniqueKey" -> {
                    el.expression(0).primary().IDENTIFIER()
                }
                "ForeignKey" -> {
                }
            }

        }
    }
}