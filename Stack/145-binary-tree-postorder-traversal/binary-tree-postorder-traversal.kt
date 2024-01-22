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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        if(root == null){
            return listOf<Int>()
        }

        return postorderTraversal(root!!.left)+postorderTraversal(root!!.right) +listOf(root.`val`)
    }
}