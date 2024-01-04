class Solution {
    fun runningSum(nums: IntArray): IntArray {
         if (nums.isEmpty()) {
            return IntArray(0)
        }

        val result = IntArray(nums.size)
        result[0] = nums[0]

        for (i in 1 until nums.size) {
            result[i] = result[i - 1] + nums[i]
        }

        return result
    }
}