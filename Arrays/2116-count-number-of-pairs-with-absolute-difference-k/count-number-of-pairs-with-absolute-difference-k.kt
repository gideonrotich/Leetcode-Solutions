class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var count = 0

         for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++
                }
            }
        }

        return count
    }
}