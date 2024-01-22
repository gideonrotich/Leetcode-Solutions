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
    var res = 0
    fun sumRootToLeaf(root: TreeNode?): Int {
       return dfs(root, 0)
    }
     private fun dfs(node: TreeNode?, currentSum: Int): Int {
        if (node == null) {
            return 0
        }

        val newSum = (currentSum shl 1) or node.`val`

        return if (node.left == null && node.right == null) {
            newSum // Leaf node, return the binary representation
        } else {
            dfs(node.left, newSum) + dfs(node.right, newSum)
        }
    }
}