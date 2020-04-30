package com.theoxao.script.handler

import com.theoxao.antlr.model.Table
import com.theoxao.sql.createTable
import com.theoxao.sql.diff
import com.theoxao.sql.dropTable

/**
 * @author theo
 * @date 2020/4/28
 */
class ScriptHandler {

    fun diffTable(origin: Table?, target: Table?) = when (origin to target) {
        null to null -> ""
        null to target -> createTable(target!!)
        origin to null -> dropTable(origin!!)
        origin to target -> diff(origin, target)
        else -> ""
    }

}
