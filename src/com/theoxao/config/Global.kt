package com.theoxao.config

/**
 * @author theo
 * @date 2020/4/30
 */

var config: Config = Config()

fun onUpdateForUpdateTime() = config.onUpdateForUpdateTime

fun indexType() = config.indexType

class Config {
    var onUpdateForUpdateTime: Boolean = true
    var indexType: String = "BTREE"
}
