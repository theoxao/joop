package com.theoxao.model

class Diff(
    var oldPath: String,
    var newPath: String,
    var aMode: String,
    var bMode: String,
    var newFile: Boolean,
    var renamedFile: Boolean,
    var deletedFile: Boolean,
    var diff: String
)