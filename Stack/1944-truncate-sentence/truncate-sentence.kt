class Solution {
    fun truncateSentence(s: String, k: Int): String {
        var result = ""
        var count = 0

        for(char in s){
            result += char

            if(char  == ' '){
                count++
                if(count == k){
                    break
                }
            }
        }
        return result.trim()
    }
}