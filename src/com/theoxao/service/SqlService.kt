package com.theoxao.service

import com.theoxao.antlr.EnumWalker
import com.theoxao.antlr.KeyWalker
import com.theoxao.antlr.TableWalker
import com.theoxao.antlr.model.Key
import com.theoxao.antlr.preParse
import com.theoxao.model.diff.EnumDiff
import com.theoxao.model.diff.KeyDiff
import com.theoxao.model.diff.TableDiff
import com.theoxao.model.gitlab.TreeNode
import com.theoxao.repository.CommitRepository
import com.theoxao.repository.TreeNodeRepository
import com.theoxao.sql.diffTable

/**
 * @author theo
 * @date 2020/4/28
 */
class SqlService(private val commitRepository: CommitRepository, private val treeNodeRepository: TreeNodeRepository) {

    fun getSqlScript(current: String, target: String): List<List<String>> {
        val currentNodes = commitRepository.findOne(current)?.nodes ?: throw RuntimeException("commit id error")
        val targetNodes = commitRepository.findOne(target)?.nodes ?: throw RuntimeException("commit id error")
        val currentOnlyMap =
            treeNodeRepository.find(currentNodes.minus(targetNodes)).associateBy { it.path }.toMutableMap()
        val targetOnlyMap =
            treeNodeRepository.find(targetNodes.minus(currentNodes)).associateBy { it.path }.toMutableMap()
        val diff = arrayListOf<Pair<TreeNode?, TreeNode?>>()
        val result = currentOnlyMap.map { (path, node) ->
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
            val keyDiffs = diff.filter { it.first?.name == "Keys.java" || it.second?.name == "Keys.java" }
                .map {
                    val schema = it.first?.schema() ?: it.second?.schema()
                    val currentKeys = with(it.first) {
                        preParse(this?.blob, { KeyWalker(current) }, KeyWalker::emit)
                    }?.groupBy(Key::tableName)
                    val targetKeys = with(it.second) {
                        preParse(this?.blob, { KeyWalker(current) }, KeyWalker::emit)
                    }?.groupBy(Key::tableName)
                    KeyDiff(schema, currentKeys, targetKeys)
                }.associateBy(KeyDiff::schema)
            val enumDiffs = diff.filter { it.first?.jooqType() == "enums" || it.second?.jooqType() == "enums" }
                .map {
                    val schema = it.first?.schema() ?: it.second?.schema()
                    val currentEnums = with(it.first) {
                        preParse(this?.blob, { EnumWalker(current) }, EnumWalker::emit)
                    }
                    val targetEnums = with(it.second) {
                        preParse(this?.blob, { EnumWalker(target) }, EnumWalker::emit)
                    }
                    val enumName = currentEnums?.first ?: targetEnums?.first
                    EnumDiff(schema, enumName, currentEnums?.second, targetEnums?.second)
                }.associateBy { it.enumName }
            diff.filter { it.first?.jooqType() == "tables" || it.second?.jooqType() == "tables" }
                .map {
                    val schema = it.first?.schema() ?: it.second?.schema()
                    val currentTable = with(it.first) {
                        preParse(this?.blob, { TableWalker(current, schema) }, TableWalker::emit)
                    }
                    val targetTable = with(it.second) {
                        preParse(this?.blob, { TableWalker(target, schema) }, TableWalker::emit)
                    }
                    val currentColumnNames = currentTable?.getFullColumnName()
                    val targetColumnNames = targetTable?.getFullColumnName()
                    currentColumnNames?.forEach { (name, column) ->
                        enumDiffs[name]?.let { enum ->
                            currentTable.setEnumColumn(column.columnName, enum.current)
                        }
                    }
                    targetColumnNames?.forEach { (name, column) ->
                        enumDiffs[name]?.let { enum ->
                            targetTable.setEnumColumn(column.columnName, enum.target)
                        }

                    }
                    val tableDiff = TableDiff(schema, currentTable, targetTable).apply {
                        setKeyDiffs(keyDiffs[schema])
                    }
                    diffTable(tableDiff)
                }

        }
        return result
    }
}
