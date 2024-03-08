class Solution {
    fun findDuplicate(nums: IntArray): Int {
        for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return nums[i]
            }
        }
    }

    return -1
    }
}