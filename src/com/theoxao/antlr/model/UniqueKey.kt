package com.theoxao.antlr.model

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
) : Key
