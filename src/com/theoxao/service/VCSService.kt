package com.theoxao.service

import com.theoxao.model.gitlab.Commit
import com.theoxao.repository.CommitRepository

/**
 * @author theo
 * @date 2020/4/29
 */
class VCSService(private val commitRepository: CommitRepository) {

    fun getCommits(branch: String, size: Int, tagOnly: Boolean): List<Commit> {
        return commitRepository.findByBranch(branch, size, tagOnly)
    }

    fun decodeVersion(versionId: String): Map<String, Commit> {
        val commitIds = versionId.split("-")
        val list = commitRepository.findByCommitId(commitIds)
        return mapOf("begin" to list.first { it.shortId == commitIds[0] },
            "end" to list.first { it.shortId == commitIds[1] })
    }

}
