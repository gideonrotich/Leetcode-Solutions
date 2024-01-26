class Solution {
    fun fib(n: Int): Int {
         val dp = IntArray(n+1)

         if(n==0){
             return 0
         }

         //base cases

         dp[0] = 0
         dp[1] = 1

         for(i in 2..n){
             dp[i] = dp[i-1] + dp[i-2] 
         }

         return dp[n]
    }
}