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
    fun increasingBST(root: TreeNode?): TreeNode? {
         if (root == null) {
            return null
        }

        val stack = Stack<TreeNode>()
        var current = root
        var result: TreeNode? = null
        var prev: TreeNode? = null

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current)
                current = current.left
            }

            current = stack.pop()

            if (result == null) {
                result = TreeNode(current.`val`)
                prev = result
            } else {
                prev?.right = TreeNode(current.`val`)
                prev = prev?.right
            }

            current = current.right
        }

        return result
    }
}