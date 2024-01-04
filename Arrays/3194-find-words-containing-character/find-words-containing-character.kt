class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val result = mutableListOf<Int>()

        for((index,word) in words.withIndex()){
            if(x in word){
                result.add(index)
            }
        }

        return result
    }
}