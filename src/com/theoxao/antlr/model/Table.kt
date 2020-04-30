package com.theoxao.antlr.model

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
    var schema: String,
    var tableName: String,
    var columns: List<Column>,
    var keys: MutableList<Key>
) : Definition {

    companion object {
        fun drop(origin: Table): String = with(origin) {
            return """
            drop table  `$schema`.`$tableName` if exists;
        """.trimIndent()
        }
    }

    override fun create(): String {
        return """
            create table `$schema`.`$tableName` (
                ${columns.joinToString(",") { it.create() }} 
                ${if (keys.isEmpty()) "" else ","}
                ${keys.joinToString(",") { it.create() }}
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;
        """.trimIndent()
    }

    fun alter() = """
        ALTER TABLE `$schema`.`$tableName`
            ;
    """.trimIndent()

}
