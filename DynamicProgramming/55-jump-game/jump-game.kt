class Solution {
    fun canJump(nums: IntArray): Boolean {
       val n = nums.size
        var maxReach = 0

        for (i in 0 until n) {
            // If the current index is not reachable, return false
            if (i > maxReach) {
                return false
            }

            // Update maxReach based on the current jump
            maxReach = maxOf(maxReach, i + nums[i])

            // If we can reach the end, return true
            if (maxReach >= n - 1) {
                return true
            }
        }

        return false


    }
}