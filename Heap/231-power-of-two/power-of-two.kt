class Solution {
    fun isPowerOfTwo(n: Int): Boolean {

        if(n<= 0) return false

        return (n and (n-1) == 0)
        
    }
}