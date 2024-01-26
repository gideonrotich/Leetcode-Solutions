class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size
        val dp = IntArray(n)

        dp[0] = cost[0]
        dp[1] = cost[1]

        for(i in 2 until n){
            dp[i] = cost[i]+ minOf(dp[i-1],dp[i-2])
        }

        return minOf(dp[n-1],dp[n-2])
    }
}