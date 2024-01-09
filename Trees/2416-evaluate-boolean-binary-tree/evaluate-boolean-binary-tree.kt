/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun evaluateTree(root: TreeNode?): Boolean {
        return when (root?.`val`){
            1 -> true
            0 -> false
            2 -> evaluateTree(root?.left) or evaluateTree(root?.right)
            else -> evaluateTree(root?.left) and evaluateTree(root?.right)
        }
    }
}