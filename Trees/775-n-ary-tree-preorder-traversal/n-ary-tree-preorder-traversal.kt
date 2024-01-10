/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun preorder(root: Node?): List<Int> {
        val list = mutableListOf<Int>()

        root?.let{
            list.add(it.`val`)
            it.children.forEach{
                list.addAll(preorder(it))
            }
        }

        return list
    }
}