package com.theoxao.antlr.model

import com.google.common.base.CaseFormat

/**
 * @author theo
 * @date 2020/4/28
 *
 * operations
 *      create
 *      drop
 *      alter
 *
 */
class Table(
    var commitId: String,
    var schema: String?,
    var tableName: String,
    var columns: List<Column>,
    var keys: MutableList<Key>
) : Definition {

    ////// sql relative functions
    companion object {
        fun drop(origin: Table): String = with(origin) {
            return """
            drop table  `$schema`.`$tableName` if exists;
        """.trimIndent()
        }
    }

    fun drop() = Companion.drop(this)

    override fun create() = """
            create table `$schema`.`$tableName` (
                ${columns.joinToString(",") { it.create() }} 
                ${if (keys.isEmpty()) "" else ","}
                ${keys.joinToString(",") { it.create() }}
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;
        """.trimIndent()

    fun alter() = """
        ALTER TABLE `$schema`.`$tableName`
            ;
    """.trimIndent()

    ///// definition relative functions

    fun getFullColumnName() =
        columns.associateBy {
            CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, this.tableName + "_" + it.columnName)
        }

    fun setEnumColumn(columnName: String, enums: List<String>?) {
        this.columns.firstOrNull { it.columnName == columnName }?.enums = enums
    }
}
