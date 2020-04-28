package com.theoxao.antlr.model

/**
 * @author theo
 * @date 2020/4/26
 */
class ForeignKey(
    var commitId: String,
    var keyId: String,
    var refKeyId: String,
    var tableName: String,
    var keyName: String,
    var columnName: String
) : Key
