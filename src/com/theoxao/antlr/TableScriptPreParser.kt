package com.theoxao.antlr

import com.theoxao.antlr.autogen.Java8Lexer
import com.theoxao.antlr.autogen.Java8Parser
import com.theoxao.antlr.autogen.Java8ParserListener
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.DefaultErrorStrategy
import org.antlr.v4.runtime.tree.ParseTreeWalker

/**
 * @author theo
 * @date 2020/4/25
 */
class TableScriptPreParser {

    fun preParse(text: String) {
        val stream = ANTLRInputStream(text)
        val lexer = Java8Lexer(stream)
        val tokenStream = CommonTokenStream(lexer)
        val javaParser = Java8Parser(tokenStream)
        javaParser.removeErrorListeners()
        javaParser.errorHandler = DefaultErrorStrategy()
        val compilationUnit = javaParser.compilationUnit()
        val listener = TableScriptListener(tokenStream)
        ParseTreeWalker.DEFAULT.walk(listener, compilationUnit)
    }

}
