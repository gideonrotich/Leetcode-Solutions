class Solution {
    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        var count = 0

        for(i in words.indices){
            for(j in i+1 until words.size){
                if(words[i] == words[j].reversed()){
                    count++
                }
            }
        }

        return count
    }
}