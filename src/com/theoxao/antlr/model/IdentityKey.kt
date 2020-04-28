package com.theoxao.antlr.model

/**
 * @author theo
 * @date 2020/4/26
 */
class IdentityKey(
    var commitId: String,
    var keyId: String,
    var tableName: String,
    var columnName: String
) : Key
