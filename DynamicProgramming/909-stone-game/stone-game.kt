class Solution {
    fun stoneGame(piles: IntArray): Boolean {
     val n = piles.size

        val dp = IntArray(n)

        // Base cases
        for (i in 0 until n) {
            dp[i] = piles[i]
        }

        // Filling the DP array
        for (length in 2..n) {
            for (i in 0 until n - length + 1) {
                val j = i + length - 1
                dp[i] = maxOf(piles[i] - dp[i + 1], piles[j] - dp[i])
            }
        }

        return dp[0] > 0
    }
}