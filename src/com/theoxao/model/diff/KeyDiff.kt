package com.theoxao.model.diff

import com.theoxao.antlr.model.Key

/**
 * @author theo
 * @date 2020/5/9
 */
class KeyDiff(
    val schema: String?,
    val current: Map<String, Key>?,
    val target: Map<String, Key>?
) {
    fun keyForTable(tableName: String): Pair<Key?, Key?> {
        return current?.get(tableName) to target?.get(tableName)
    }
}
