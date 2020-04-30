package com.theoxao.repository

import com.theoxao.common.bson
import com.theoxao.config.MongoApplication
import com.theoxao.model.gitlab.Tag
import com.theoxao.model.gitlab.TreeNode
import org.litote.kmongo.deleteMany
import org.litote.kmongo.eq

/**
 * @author theo
 * @date 2020/4/30
 */
class TagRepository(mongoApplication: MongoApplication) : BaseRepository<Tag>(mongoApplication) {

    override var collection: String = "tag"

    fun save(tags: List<Tag>) {
        val col = getCollection<Tag>()
        col.deleteMany("{}")
        col.bulkWrite(
            tags.map {
                with(it) {
                    org.litote.kmongo.updateOne<Tag>(
                        ::name eq it.name,
                        com.mongodb.client.model.Updates.setOnInsert(it.bson),
                        org.litote.kmongo.upsert()
                    )
                }
            }
        )
    }
}
