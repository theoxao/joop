package com.theoxao.antlr.model

import com.theoxao.config.onUpdateForUpdateTime
import org.antlr.v4.runtime.tree.ParseTree

/**
 * @author theo
 * @date 2020/4/27
 *
 * operations
 *      create
 *      add
 *      change
 *      modify
 *      drop
 *
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
    var enumType: String? = null
    var enums: List<String>? = null

    private val updateTimeFields = arrayOf("update_time", "update_at", "update_date", "update")

    companion object {
        fun drop(origin: Column) = """ DROP COLUMN `${origin.columnName}` """
    }

    fun initProperty(field: String, node: ParseTree) {
        when (field) {
            "nullable" -> nullable = node.text.replace("\"", "").toBoolean()
            "length" -> length = node.text.replace("\"", "").toInt()
            "defaultValue" -> defaultValue = node.getChild(0).getChild(2).getChild(2).getChild(0).text.replace("\"", "")
            "precision" -> precision = node.text
            "asEnumDataType" -> enumType = node.text
        }
    }

    override fun create() = definition()

    //FIXME
    fun change(origin: Column) = definition(" CHANGE COLUMN `${origin.columnName} `")

    fun modify() = definition("modify")

    fun add() = definition("add")

    private fun definition(prefix: String = "") = """
            $prefix
            `$columnName`  
            ${dataType.mapDataType()}  
            ${if (autoIncrement) "auto_increment key" else ""}  
            ${length?.let { "($it)" } ?: ""}  
            ${precision?.let { "($it)" } ?: ""}   
            ${if (nullable) "" else "NOT NULL"}  
            ${mapDefaultValue(dataType, defaultValue)?.let { "DEFAULT $it" } ?: ""}  
            ${if (onUpdateForUpdateTime() && (this.columnName in updateTimeFields)) "ON UPDATE CURRENT_TIMESTAMP" else ""}
        """.trimIndent().trim('\n')

    //TODO
    private fun mapDefaultValue(dataType: String, defaultValue: String?): String? {
        return when (dataType) {
            "CLOB" -> null
            else -> if (nullable)
                when (dataType) {
                    "INTEGER" -> defaultValue?.let { "'$defaultValue'" }
                    else -> defaultValue
                }
                    ?: "NULL" else null
        }
    }

    private fun String.mapDataType(): String {
        return this@Column.enums?.let { ce -> return@let "ENUM(${ce.joinToString(",") { "'$it'" }})" } ?: when (this) {
            "CLOB" -> "TEXT"
            "INTEGER" -> "INT"
            else -> this
        }
    }

}
