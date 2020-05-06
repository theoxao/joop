package com.theoxao.repository

import com.mongodb.client.model.Updates.set
import com.mongodb.client.model.Updates.setOnInsert
import com.theoxao.common.bson
import com.theoxao.config.MongoApplication
import com.theoxao.model.gitlab.TreeNode
import org.litote.kmongo.*


/**
 * @author theo
 * @date 2020/4/25
 */
class TreeNodeRepository(
    mongoApplication: MongoApplication,
    override var collection: String = "tree_node"
) : BaseRepository<TreeNode>(mongoApplication) {


    fun save(nodes: List<TreeNode>) {
        if (nodes.isNotEmpty())
            getCollection<TreeNode>().bulkWrite(
                nodes.map {
                    with(it) {
                        updateOne<TreeNode>(::id eq it.id, setOnInsert(it.bson), upsert())
                    }
                }
            )
    }

    fun getUnblob(): MutableList<TreeNode> {
        return getCollection<TreeNode>().find("{ blob: null , type: 'blob' }").toMutableList()
    }

    fun updateBlob(id: String, blob: String) {
        getCollection<TreeNode>().updateOne(
            TreeNode::id eq id,
            set(TreeNode::blob.name, blob)
        )
    }

    fun find(ids: List<String>): List<TreeNode> {
        return getCollection<TreeNode>().find(TreeNode::id `in` ids).toMutableList()
    }


}
