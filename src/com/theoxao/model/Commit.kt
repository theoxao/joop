package com.theoxao.model

class Commit(
    var id: String,
    var shortId: String,
    var title: String,
    var createdAt: String,
    var parentIds: List<String>,
    var message: String,
    var authorName: String,
    var authorEmail: String,
    var authoredDate: String,
    var committerName: String,
    var committerEmail: String,
    var committedDate: String
)