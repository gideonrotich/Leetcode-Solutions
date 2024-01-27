class Solution {
    fun rob(nums: IntArray): Int {
          val n = nums.size

        if (n == 0) return 0
        if (n == 1) return nums[0]

        val dp = IntArray(n)

        // Base cases
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])

        for (i in 2 until n) {
            // Choose the maximum between robbing the current house and skipping it
            dp[i] = maxOf(dp[i - 2] + nums[i], dp[i - 1])
        }

        return dp[n - 1]
    }
}