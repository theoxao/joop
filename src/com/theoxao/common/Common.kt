package com.theoxao.common

import com.mongodb.BasicDBObject
import org.bson.conversions.Bson
import org.litote.kmongo.json

fun repeatUntil(breakAt: () -> Boolean, action: () -> Unit) {
    while (breakAt()) {
        action()
    }
}

val Any.bson: Bson
    get() = BasicDBObject.parse(json)
