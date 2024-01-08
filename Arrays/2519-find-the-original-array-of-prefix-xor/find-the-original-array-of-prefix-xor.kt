class Solution {
    fun findArray(pref: IntArray): IntArray {
        
       var prev = pref[0]

       for(i in 1 until pref.size){
           pref[i] = prev xor pref[i]
           prev = prev xor pref[i]
       }

       return pref
    }
}