package com.theoxao.repository

import com.mongodb.client.model.Updates.set
import com.mongodb.client.model.Updates.setOnInsert
import com.theoxao.common.bson
import com.theoxao.config.MongoApplication
import com.theoxao.model.gitlab.Commit
import org.litote.kmongo.eq
import org.litote.kmongo.find
import org.litote.kmongo.updateOne
import org.litote.kmongo.upsert

class CommitRepository(
    mongoApplication: MongoApplication,
    override var collection: String = "commits"
) : BaseRepository<Commit>(mongoApplication) {

    fun findLatest(): Commit? {
        return getCollection<Commit>().find().toList().maxBy { it.commitTimestamp }
    }

    fun save(list: List<Commit>) {
        if (list.isNotEmpty())
            getCollection<Commit>().bulkWrite(list.map {
                with(it) {
                    updateOne<Commit>(
                        ::id eq it.id,
                        setOnInsert(it.bson),
                        upsert()
                    )
                }
            })
    }

    fun findUnnode(): List<Commit> {
        return getCollection<Commit>().find("{ nodes: null } }").toMutableList()
    }

    fun updateNodes(id: String, nodes: List<String>) {
        getCollection<Commit>().updateOne(
            Commit::id eq id,
            set(Commit::nodes.name, nodes)
        )
    }
}
