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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()

        if(root == null){
            return listOf<Int>()
        }
        

        return inorderTraversal(root!!.left)+ listOf(root!!.`val`) + inorderTraversal(root!!.right)
    }
}