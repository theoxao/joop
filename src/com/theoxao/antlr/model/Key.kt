package com.theoxao.antlr.model

/**
 * @author theo
 * @date 2020/4/28
 */
interface Key : Definition {

    var tableName: String

    fun add(): String
}
