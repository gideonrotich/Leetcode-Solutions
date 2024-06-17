class Solution {
    fun judgeSquareSum(c: Int): Boolean {
        var left = 0
        var right = kotlin.math.sqrt(c.toDouble()).toInt()
        
        while (left <= right) {
            val sum = left.toLong() * left + right.toLong() * right // use Long to avoid overflow
            when {
                sum == c.toLong() -> return true
                sum < c.toLong() -> left++
                else -> right--
            }
        }
        return false
    }
}