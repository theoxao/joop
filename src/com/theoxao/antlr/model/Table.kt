package com.theoxao.antlr.model

/**
 * @author theo
 * @date 2020/4/28
 */
class Table(
    var commitId: String,
    var schema: String,
    var tableName: String,
    var columns: List<Column>,
    var indexes: List<IndexKey>
) : Definition {

    fun drop(): String {
        return """
            drop table  `$schema`.`$tableName` if exists;
        """.trimIndent()
    }

    fun create(): String {
        return """
            create table `$schema`.`$tableName` (
                
            
            )
        """.trimIndent()
    }
}
