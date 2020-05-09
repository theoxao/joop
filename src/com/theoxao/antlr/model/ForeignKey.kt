package com.theoxao.antlr.model

/**
 * @author theo
 * @date 2020/4/26
 */
class ForeignKey(
    var commitId: String,
    var keyId: String,
    var refKeyId: String,
    override var tableName: String,
    var keyName: String,
    var columnName: String
) : Key {
    override fun add() = """"""

    override fun create(): String {
        return """ CONSTRAINT `$keyName` FOREIGN KEY (`$columnName`) REFERENCES `$tableName` (`$refKeyId`) """
    }

    fun drop(): String {
        TODO("Not yet implemented")
    }

}
