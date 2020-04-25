package com.theoxao.antlr

import com.theoxao.antlr.autogen.Java8ParserBaseListener
import org.antlr.v4.runtime.TokenStream
import org.antlr.v4.runtime.TokenStreamRewriter

/**
 * @author theo
 * @date 2020/4/25
 */
class TableScriptListener(private val tokenStream: TokenStream) : Java8ParserBaseListener() {
    var writer: TokenStreamRewriter = TokenStreamRewriter(tokenStream)


}
