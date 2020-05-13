package com.theoxao.model.diff

/**
 * @author theo
 * @date 2020/5/11
 */
class EnumDiff(
    val schema: String?,
    val enumName: String?,
    val current: List<String>?,
    var target: List<String>?
)
