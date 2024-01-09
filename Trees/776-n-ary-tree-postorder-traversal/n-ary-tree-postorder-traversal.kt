/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun postorder(root: Node?): List<Int> {
        
        val list = mutableListOf<Int>()

        root?.let{
            it.children.forEach{
                list.addAll(postorder(it))
            }
            list.add(it.`val`)
        }
        

        return list
    }
}