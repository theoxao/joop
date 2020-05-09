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
)
