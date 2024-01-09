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
    fun checkTree(root: TreeNode?): Boolean {
        var result :Boolean = false

        val sum = root!!.left.`val` + root!!.right.`val`

        if(sum == root!!.`val`){
            result = true
        }else{
            result= false
        }

        return result
    }
}