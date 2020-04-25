package com.theoxao.script.parser

import groovy.lang.GroovyShell

/**
 * @author theo
 * @date 2020/4/25
 */
class GroovyScriptParser {

    private val groovyShell = GroovyShell()

    fun parse(raw: String) {
        val script = groovyShell.parse(raw)
        script.metaClass
    }

}
