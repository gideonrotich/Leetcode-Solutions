class Solution {
    fun maxSubArray(nums: IntArray): Int {
         if (nums.isEmpty()) return 0
        
        var maxSum = nums[0] // Initialize maxSum to the first element
        var currentSum = nums[0] // Initialize currentSum to the first element
        
        // Iterate through the array starting from the second element
        for (i in 1 until nums.size) {
            // Calculate the current sum by either adding the current element to the previous sum
            // or starting a new subarray with the current element
            currentSum = maxOf(nums[i], currentSum + nums[i])
            
            // Update maxSum if the current sum is greater
            maxSum = maxOf(maxSum, currentSum)
        }
        
        return maxSum
    }
}