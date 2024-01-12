class Solution {
    fun cellsInRange(s: String): List<String> {
        
        val result = mutableListOf<String>()

        for(i in s[0]..s[3]){
            for(j in s[1]..s[4]){
               result.add("$i$j")
            }
        }

        return result
    }
}