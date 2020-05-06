package com.theoxao.repository

import com.mongodb.client.MongoCollection
import com.theoxao.config.MongoApplication
import com.theoxao.model.gitlab.Commit

/**
 * @author theo
 * @date 2020/4/24
 */
abstract class BaseRepository<T>(val mongoApplication: MongoApplication) {
    abstract var collection: String

    inline fun <reified T : Any> getCollection(): MongoCollection<T> {
        return this.mongoApplication.database.getCollection(collection, T::class.java)
    }


}
