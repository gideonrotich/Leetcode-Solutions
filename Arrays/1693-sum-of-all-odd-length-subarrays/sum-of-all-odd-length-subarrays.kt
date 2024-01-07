class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
         var oddSum = 0
    
    for (i in 1..arr.size step 2) {
        oddSum += arr.toList().windowed(i).map { it.sum() }.sum()
    }
    
    return oddSum


    }
}