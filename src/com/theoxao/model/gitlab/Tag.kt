package com.theoxao.model.gitlab

import com.fasterxml.jackson.annotation.JsonProperty
import org.bson.types.ObjectId


/**
 * @author theo
 * @date 2020/4/30
 */

data class Tag(
    @JsonProperty("commit")
    var commit: Commit? = null,
    @JsonProperty("release")
    var release: Release? = null,
    @JsonProperty("name")
    var name: String? = null,
    @JsonProperty("message")
    var message: Any? = null
)

data class Release(
    @JsonProperty("tag_name")
    var tagName: String? = null,
    @JsonProperty("description")
    var description: String? = null
)
