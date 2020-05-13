package com.theoxao.sql

import com.theoxao.antlr.model.Table
import com.theoxao.model.diff.TableDiff

/**
 * @author theo
 * @date 2020/4/30
 */

fun dropTable(origin: Table): String {
    return Table.drop(origin)
}

fun createTable(target: Table): String {
    return target.create()
}

fun diffTable(diff: TableDiff): String {
    return diff(diff.current, diff.target)
}

fun diff(current: Table?, target: Table?): String {
    if (current == null && target != null) return target.create().replace("\n", " ")
    if (current != null && target == null) return current.drop()

    return ""
}

