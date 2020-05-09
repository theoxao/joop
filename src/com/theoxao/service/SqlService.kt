package com.theoxao.service

import com.theoxao.antlr.KeyWalker
import com.theoxao.antlr.TableWalker
import com.theoxao.antlr.model.Key
import com.theoxao.antlr.model.Table
import com.theoxao.antlr.preParse
import com.theoxao.model.diff.KeyDiff
import com.theoxao.model.gitlab.TreeNode
import com.theoxao.repository.CommitRepository
import com.theoxao.repository.TreeNodeRepository

/**
 * @author theo
 * @date 2020/4/28
 */
class SqlService(private val commitRepository: CommitRepository, private val treeNodeRepository: TreeNodeRepository) {

    fun getSqlScript(current: String, target: String) {
        val currentNodes = commitRepository.findOne(current)?.nodes ?: throw RuntimeException("commit id error")
        val targetNodes = commitRepository.findOne(target)?.nodes ?: throw RuntimeException("commit id error")
        val currentOnlyMap =
            treeNodeRepository.find(currentNodes.minus(targetNodes)).associateBy { it.path }.toMutableMap()
        val targetOnlyMap =
            treeNodeRepository.find(targetNodes.minus(currentNodes)).associateBy { it.path }.toMutableMap()
        val diff = arrayListOf<Pair<TreeNode?, TreeNode?>>()
        currentOnlyMap.forEach { (path, node) ->
            if (targetOnlyMap.containsKey(path)) {
                diff.add(node to targetOnlyMap[path])
            } else {
                diff.add(node to null)
            }
            targetOnlyMap.forEach { (path, node) ->
                if (!currentOnlyMap.containsKey(path)) {
                    diff.add(null to node)
                }
            }
            val keyDiffs = diff.filter { it.first?.name == "Keys.java" || it.second?.name == "Keys.java" }.map {
                val schema = it.first?.schema() ?: it.second?.schema()
                val currentKeys = with(it.first) {
                    preParse(this?.blob, { KeyWalker(current) }, KeyWalker::emit)
                }?.associateBy(Key::tableName)
                val targetKeys = with(it.second) {
                    preParse(this?.blob, { KeyWalker(current) }, KeyWalker::emit)
                }?.associateBy(Key::tableName)

                KeyDiff(schema, currentKeys, targetKeys)
            }
            diff.filter { it.first?.jooqType() == "tables" || it.second?.jooqType() == "tables" }
                .map {
                    val schema = it.first?.schema() ?: it.second?.schema()
                    val currentTable = with(it.first) {
                        preParse(this?.blob, { TableWalker(current) }, TableWalker::emit)
                    }
                    val targetTable = with(it.second) {
                        preParse(this?.blob, { TableWalker(target) }, TableWalker::emit)
                    }
                }
            println("diff")
        }

    }
}
