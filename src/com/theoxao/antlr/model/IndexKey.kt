package com.theoxao.antlr.model

/**
 * @author theo
 * @date 2020/4/29
 */
class IndexKey(
    var commitId: String,
    var tableName: String,
    var indexName: String,
    var columns: List<String>
)
