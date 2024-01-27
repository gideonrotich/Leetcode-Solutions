class Solution {
    fun triangularSum(nums: IntArray): Int {
        return getTriangularSum(nums)
    }

     private fun getTriangularSum(nums: IntArray): Int {
        if (nums.size == 1) {
            return nums[0]
        }

        val newNums = IntArray(nums.size - 1)

        for (i in 0 until nums.size - 1) {
            newNums[i] = (nums[i] + nums[i + 1]) % 10
        }

        return getTriangularSum(newNums)
    }
}