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

    fun decodeVersion(versionId: String): List<Commit> {
        val commitIds = versionId.split("-")
        return commitRepository.findByCommitId(commitIds)
    }

}
