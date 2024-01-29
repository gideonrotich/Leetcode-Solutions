class Solution {
    fun jump(nums: IntArray): Int {
   val n = nums.size

        if (n == 1) {
            return 0
        }

        var result = 0
        var maxReach = 0
        var steps = 0

        for (i in 0 until n - 1) {
            maxReach = maxOf(maxReach, i + nums[i])

            if (i == steps) {
                steps = maxReach
                result++
            }
        }

        return result

    }
}