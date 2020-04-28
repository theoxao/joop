package com.theoxao.antlr.model

import org.antlr.v4.runtime.tree.ParseTree

/**
 * @author theo
 * @date 2020/4/27
 */
class Column(
    var commitId: String,
    var columnName: String,
    var comment: String? = null
) : Definition {
    lateinit var table: String
    lateinit var dataType: String
    var length: Int? = null
    var precision: String? = null
    var nullable: Boolean = true
    var defaultValue: String? = null
    var autoIncrement: Boolean = false

    fun initProperty(field: String, node: ParseTree) {
        when (field) {
            "nullable" -> nullable = node.text.replace("\"", "").toBoolean()
            "length" -> length = node.text.replace("\"", "").toInt()
            "defaultValue" -> defaultValue = node.getChild(0).getChild(2).getChild(2).getChild(0).text.replace("\"", "")
            "precision" -> precision = node.text
        }
    }


    fun create(): String {
        return """
            $columnName  
            ${mapDataType(dataType)}  
            ${if (autoIncrement) "auto_increment key" else ""}  
            ${length?.let { "($this)" }}  
            ${precision?.let { "($this)" }}   
            ${if (nullable) "NULL" else "NOT NULL"}  
            ${mapDefaultValue(dataType, defaultValue)}  
            
        """.trimIndent().trim('\n')
    }

    private fun mapDefaultValue(dataType: String, defaultValue: String?): String {
        defaultValue ?: return ""
        return when (dataType) {
            "" -> defaultValue
            else -> throw RuntimeException("data type not support")
        }
    }

    private fun mapDataType(dataType: String): String {
        return when (dataType) {
            "" -> ""
            else -> throw RuntimeException("data type not support")
        }
    }

}
