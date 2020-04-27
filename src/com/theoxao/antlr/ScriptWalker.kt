package com.theoxao.antlr

import com.theoxao.antlr.autogen.JavaLexer
import com.theoxao.antlr.autogen.JavaParser
import com.theoxao.antlr.autogen.JavaParserBaseListener
import com.theoxao.antlr.model.Column
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker

/**
 * @author theo
 * @date 2020/4/27
 */

fun preParse(text: String, listenerProvider: (TokenStream) -> JavaParserBaseListener) {
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


    val columns: MutableList<Column> = mutableListOf()

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

