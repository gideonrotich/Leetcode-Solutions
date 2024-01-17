class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    val map = TreeMap<Int,String>(compareByDescending { it })
        
        // heights.forEachIndexed { i, height ->
        //     map[height] = names[i]
        // }

        for(i in heights.indices){
            map[heights[i]] = names[i]
        }
                
        return map.values.toTypedArray()
    }
}