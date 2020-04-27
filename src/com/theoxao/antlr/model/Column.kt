package com.theoxao.antlr.model

import com.theoxao.antlr.autogen.JavaParser
import org.antlr.v4.runtime.tree.ParseTree

/**
 * @author theo
 * @date 2020/4/27
 */
class Column : Definition {
    lateinit var table: String

    lateinit var name: String
    lateinit var dataType: String
    var length: Int = -1
    var precision: String? = null
    var nullable: Boolean = true
    var defaultValue: String? = null
    var comment: String? = null


    fun initProperty(field: String, node: ParseTree) {
        when (field) {
            "nullable" -> nullable = node.text.replace("\"", "").toBoolean()
            "length" -> length = node.text.replace("\"", "").toInt()
            "defaultValue" -> defaultValue = node.getChild(0).getChild(2).getChild(2).getChild(0).text.replace("\"", "")
            "precision" -> precision = node.text
        }
    }

}
