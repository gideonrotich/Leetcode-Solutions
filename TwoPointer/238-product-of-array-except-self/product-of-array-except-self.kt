class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
          val n = nums.size
        val output = IntArray(n)
        
        // Calculate the product of all elements to the left of each element
        var leftProduct = 1
        for (i in 0 until n) {
            output[i] = leftProduct
            leftProduct *= nums[i]
        }
        
        // Calculate the product of all elements to the right of each element
        var rightProduct = 1
        for (i in n - 1 downTo 0) {
            output[i] *= rightProduct
            rightProduct *= nums[i]
        }
        
        return output
    }
}