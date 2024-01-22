/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun maxDepth(root: Node?): Int {
        if (root == null) {
            return 0
        }

        var maxChildDepth = 0
        for (child in root.children) {
            val childDepth = maxDepth(child)
            maxChildDepth = maxOf(maxChildDepth, childDepth)
        }

        return 1 + maxChildDepth
    }
}