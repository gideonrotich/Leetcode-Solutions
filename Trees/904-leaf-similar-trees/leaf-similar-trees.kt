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
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val list1= mutableListOf<Int>()
        val list2 = mutableListOf<Int>()

        fun count(root:TreeNode?, list:MutableList<Int>){
            if(root == null) return

            if(root.left == null && root.right == null){
                list.add(root.`val`)
            }
            count(root.left,list)
            count(root.right,list)
        }

        count(root1,list1)
        count(root2,list2)

        return list1 == list2
    }
}