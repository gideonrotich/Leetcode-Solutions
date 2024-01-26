class Solution {
    val cache = HashMap<Int,Int>()

    fun fib(n: Int): Int {
        //using dynamic programming
        //  val dp = IntArray(n+1)

        //  if(n==0){
        //      return 0
        //  }

        //  //base cases

        //  dp[0] = 0
        //  dp[1] = 1

        //  for(i in 2..n){
        //      dp[i] = dp[i-1] + dp[i-2] 
        //  }

        //  return dp[n]

        //using memoization

        if(n <= 1){
            return n
        }

        if(!cache.containsKey(n)){
            cache[n] = fib(n-1)+fib(n-2)
        }

        return cache[n]!!

    }
}