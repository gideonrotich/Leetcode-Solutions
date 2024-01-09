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
    fun invertTree(root: TreeNode?): TreeNode? {
        
        if(root == null){
            return null
        }

        val test = TreeNode(root?.`val` ?: 0)
        test.left = invertTree(root?.right)
        test.right = invertTree(root?.left)

        return test
    }
}