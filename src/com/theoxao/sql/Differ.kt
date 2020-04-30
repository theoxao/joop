package com.theoxao.sql

import com.theoxao.antlr.model.Table

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

fun diff(origin: Table?, target: Table?): String {
    assert(origin != null)
    assert(target != null)

    return ""
}
