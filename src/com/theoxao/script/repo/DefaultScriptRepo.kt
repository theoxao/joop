package com.theoxao.script.repo

import cc.hibay.com.theoxao.script.GitlabScriptSupplier
import com.theoxao.model.gitlab.TreeNode
import com.theoxao.repository.CommitRepository
import com.theoxao.repository.TagRepository
import com.theoxao.repository.TreeNodeRepository
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.runBlocking
import org.koin.java.KoinJavaComponent.inject
import org.slf4j.LoggerFactory

/**
 * @author theo
 * @date 2020/4/24
 */
@KtorExperimentalAPI
class DefaultScriptRepo(
    private val scriptSupplier: GitlabScriptSupplier
) : ScriptRepo {

    private val log = LoggerFactory.getLogger(this::class.java)

    private val commitRepository by inject(CommitRepository::class.java)
    private val treeNodeRepository by inject(TreeNodeRepository::class.java)
    private val tagRepository: TagRepository by inject(TagRepository::class.java)


    private val basePath = scriptSupplier.basePath
    private val baseCommit = scriptSupplier.config.property("baseCommit").getString()
    private val branch = scriptSupplier.branch

    fun sync() {
        runBlocking {
            getCommits()
            getTreeNode()
            getBlob()
            getTags()
        }
    }

    suspend fun getCommits() {
        val lastCommit = commitRepository.findLatest()
        val list = scriptSupplier.fetchCommits(baseCommit = lastCommit?.id ?: baseCommit).toMutableList()
            .sortedBy { it.committedDate }
        commitRepository.save(list)
    }

    suspend fun getTreeNode() {
        val list = commitRepository.findUnnode()
        log.info("found {} un_node record", list.size)
        list.forEach { commit ->
            val nodes = scriptSupplier.fetchFileTree(ref = commit.id)
            treeNodeRepository.save(nodes)
            commitRepository.updateNodes(commit.id, nodes.map(TreeNode::id))
        }
    }

    suspend fun getBlob() {
        val list = treeNodeRepository.getUnblob()
        log.info("found {} un_blob record", list.size)
        list.forEach {
            val blob = scriptSupplier.fetchRawScript(it.id)
            treeNodeRepository.updateBlob(it.id, blob)
        }
    }

    suspend fun getTags() {
        val list = scriptSupplier.fetchTags()
        log.info("fetched {} tags ", list.size)
        tagRepository.save(list)
        commitRepository.updateTags(branch, list)
    }


}
