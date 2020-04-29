package com.theoxao.model.gitlab

import com.fasterxml.jackson.annotation.JsonProperty
import org.joda.time.DateTime


data class Commit(
    @JsonProperty("id")
    var id: String,
    @JsonProperty("short_id")
    var shortId: String,
    @JsonProperty("title")
    var title: String,
    @JsonProperty("created_at")
    var createdAt: String,
    @JsonProperty("parent_ids")
    var parentIds: List<String>,
    @JsonProperty("message")
    var message: String,
    @JsonProperty("author_name")
    var authorName: String? = null,
    @JsonProperty("author_email")
    var authorEmail: String,
    @JsonProperty("authored_date")
    var authoredDate: String? = null,
    @JsonProperty("committer_name")
    var committerName: String? = null,
    @JsonProperty("committer_email")
    var committerEmail: String? = null,
    @JsonProperty("committed_date")
    var committedDate: String
) {

    @JsonProperty("commit_timestamp")
    var commitTimestamp: Long = DateTime.parse(committedDate).millis

    @JsonProperty("nodes")
    var nodes: List<String>? = null

    @JsonProperty("branch")
    lateinit var branch: String
}
