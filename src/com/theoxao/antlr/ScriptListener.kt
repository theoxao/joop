package com.theoxao.antlr

import com.theoxao.antlr.autogen.Java8Lexer
import com.theoxao.antlr.autogen.Java8Parser
import com.theoxao.antlr.autogen.Java8ParserBaseListener
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNodeImpl

/**
 * @author theo
 * @date 2020/4/25
 */

fun preParse(text: String, listenerProvider: (TokenStream) -> Java8ParserBaseListener) {
    val stream = ANTLRInputStream(text)
    val lexer = Java8Lexer(stream)
    val tokenStream = CommonTokenStream(lexer)
    val javaParser = Java8Parser(tokenStream)
    javaParser.removeErrorListeners()
    javaParser.errorHandler = DefaultErrorStrategy()
    val compilationUnit = javaParser.compilationUnit()
    val listener = listenerProvider(tokenStream)
    ParseTreeWalker.DEFAULT.walk(listener, compilationUnit)
}

class TableScriptListener(private val tokenStream: TokenStream) : Java8ParserBaseListener() {
    var writer: TokenStreamRewriter = TokenStreamRewriter(tokenStream)


}

class KeyScriptListener(private val tokenStream: TokenStream) : Java8ParserBaseListener() {
    var writer: TokenStreamRewriter = TokenStreamRewriter(tokenStream)


    override fun enterNormalClassDeclaration(ctx: Java8Parser.NormalClassDeclarationContext) {
        ctx.children.firstOrNull {
            it is TerminalNodeImpl && it.text.startsWith("UniqueKeys")
        }
    }
}


