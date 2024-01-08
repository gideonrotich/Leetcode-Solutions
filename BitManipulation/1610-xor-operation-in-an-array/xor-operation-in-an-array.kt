class Solution {
    fun xorOperation(n: Int, start: Int): Int {
        var result = start

        for(i in 1 until n){
            val current = start + 2 * i
            result = result xor current
        }

        return result
    }
}