package com.theoxao.service

import com.theoxao.repository.CommitRepository
import com.theoxao.repository.TreeNodeRepository
import java.lang.RuntimeException

/**
 * @author theo
 * @date 2020/4/28
 */
class SqlService(private val commitRepository: CommitRepository, private val treeNodeRepository: TreeNodeRepository) {

    fun getSqlScript(current: String, target: String) {
        val currentNodes = commitRepository.findOne(current)?.nodes ?: throw RuntimeException("commit id error")
        val targetNodes = commitRepository.findOne(target)?.nodes ?: throw RuntimeException("commit id error")
        val currentOnlyNode = treeNodeRepository.find(currentNodes.minus(targetNodes)).associateBy { it.path }
        val targetOnlyNode = treeNodeRepository.find(targetNodes.minus(currentNodes)).associateBy { it.path }
    }

}
