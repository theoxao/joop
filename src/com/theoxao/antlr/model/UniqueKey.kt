package com.theoxao.antlr.model

import com.theoxao.config.indexType

/**
 * @author theo
 * @date 2020/4/26
 */
class UniqueKey(
    var commitId: String,
    var keyId: String,
    var tableName: String,
    var keyName: String,
    var columns: Array<String>
) : Key {

    private val isPrimary = keyId.endsWith("_PRIMARY")

    override fun add() = """"""


    override fun create(): String =
        if (isPrimary)
            """ PRIMARY KEY (${columns.toFieldString()}) USING ${indexType()} """
        else
            """ UNIQUE KEY `$keyName` (${columns.toFieldString()}) USING ${indexType()} """

    fun rename(origin: UniqueKey) = """ RENAME INDEX `${origin.keyName}` TO `$keyName` """

    private fun Array<String>.toFieldString(): String {
        return this.joinToString(",") { "`$it`" }
    }

    companion object {
        fun drop(origin: Column) = """DROP INDEX `${origin.columnName}`"""
    }

}
