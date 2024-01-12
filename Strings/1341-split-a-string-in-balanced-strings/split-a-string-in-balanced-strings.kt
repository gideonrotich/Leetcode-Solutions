class Solution {
    fun balancedStringSplit(s: String): Int {
        var rcounter = 0
        var lcounter = 0   
        var result = 0

        s.forEach{
            if(it == 'R')rcounter++ else lcounter++
            if(rcounter == lcounter)result++
        }

        return result
    }
}