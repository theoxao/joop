package com.theoxao.antlr.model

/**
 * @author theo
 * @date 2020/4/26
 */
class IdentityKey(
    var commitId: String,
    var keyId: String,
    override var tableName: String,
    var columnName: String
) : Key {
    override fun add() = """"""

    override fun create() = ""
    fun drop(): String {
        TODO("Not yet implemented")
    }

}
