package com.theoxao.antlr.model

import com.theoxao.config.indexType

/**
 * @author theo
 * @date 2020/4/29
 */
class IndexKey(
    var commitId: String,
    override var tableName: String,
    var indexName: String,
    var columns: List<String>
) : Key {
    override fun create(): String =
        """ UNIQUE KEY `$indexName` (${columns.toFieldString()}) USING ${indexType()} """

    fun drop() = ""

    override fun add() = """"""

    private fun List<String>.toFieldString(): String {
        return this.joinToString(",") { "`$it`" }
    }

}
