package com.theoxao.repository

import com.mongodb.client.model.Updates.set
import com.mongodb.client.model.Updates.setOnInsert
import com.theoxao.common.bson
import com.theoxao.config.MongoApplication
import com.theoxao.model.gitlab.Commit
import com.theoxao.model.gitlab.Tag
import org.bson.conversions.Bson
import org.litote.kmongo.*
import kotlin.collections.toList

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

    fun findByBranch(branch: String, size: Int, tagOnly: Boolean): List<Commit> {
        val filter = mutableListOf(Commit::branch eq branch)
        if (tagOnly) {
            filter.add(Commit::tagName ne null)
        }
        return getCollection<Commit>().find(*filter.toTypedArray()).sort("{commit_timestamp : -1}").limit(size).toMutableList()

    }

    fun updateTags(branch: String, list: List<Tag>) {
        getCollection<Commit>().updateMany(Commit::branch eq branch, set(Commit::tagName.name, null))
        getCollection<Commit>().bulkWrite(
            list.map {
                updateOne<Commit>(
                    Commit::id eq it.commit?.id,
                    set("tag_name", it.name)
                )
            }
        )
    }

    fun findByCommitId(commitIds: List<String>): List<Commit> {
        return getCollection<Commit>().find(Commit::shortId `in` commitIds).toList()
    }
}
