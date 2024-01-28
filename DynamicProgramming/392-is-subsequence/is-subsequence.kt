class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var sPointer = 0
        var tPointer = 0

        while(sPointer<s.length && tPointer<t.length){
            if(s[sPointer] ==  t[tPointer]){
                sPointer++
            }
            tPointer++
        }

        return sPointer == s.length 
    }
}