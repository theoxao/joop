package com.theoxao.service

import com.theoxao.model.gitlab.Commit
import com.theoxao.repository.CommitRepository

/**
 * @author theo
 * @date 2020/4/29
 */
class CSVService(private val commitRepository: CommitRepository) {

    fun getCommits(branch: String?): List<Commit> {
        return branch?.let {
            commitRepository.findByBranch(branch)
        } ?: arrayListOf<Commit>()
    }

}
