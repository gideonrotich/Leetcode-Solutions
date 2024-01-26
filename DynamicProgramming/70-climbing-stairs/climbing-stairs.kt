class Solution {
    fun climbStairs(n: Int): Int {

        if(n<=2){
            return n
        }

        val dp = IntArray(n+1)

        //base cases
        dp[1] = 1
        dp[2] = 2

        for(i in 3..n){
            dp[i] = dp[i-1] + dp[i-2]
        }

        return dp[n]
        
    }
}