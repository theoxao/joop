package com.theoxao.model.diff

import com.theoxao.antlr.model.Table


/**
 * @author theo
 * @date 2020/4/28
 */
class TableDiff(
    val schema: String?,
    val current: Table?,
    val target: Table?
) {

    fun setKeyDiffs(diffs: KeyDiff?) {
        diffs ?: return
        current?.keys?.addAll(diffs.current?.get(current.tableName) ?: arrayListOf())
        target?.keys?.addAll(diffs.target?.get(target?.tableName)?.toMutableList() ?: arrayListOf())
    }

}
