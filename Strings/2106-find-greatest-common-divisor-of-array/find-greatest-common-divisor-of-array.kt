class Solution {
    fun findGCD(nums: IntArray): Int {
        val smallest = nums.minOrNull() ?: 0
        val greatest = nums.maxOrNull() ?: 0

        var gcd = 1
        for (i in 1..smallest.coerceAtMost(greatest)) {
            if (smallest % i == 0 && greatest % i == 0) {
                gcd = i
            }
        }

        return gcd
    }
}