package com.theoxao.model.gitlab

import com.fasterxml.jackson.annotation.JsonProperty


data class TreeNode(
    @JsonProperty("id")
    var id: String,
    @JsonProperty("name")
    var name: String,
    @JsonProperty("type")
    var type: String,
    @JsonProperty("path")
    var path: String,
    @JsonProperty("mode")
    var mode: String
) {
    var blob: String? = null
}
