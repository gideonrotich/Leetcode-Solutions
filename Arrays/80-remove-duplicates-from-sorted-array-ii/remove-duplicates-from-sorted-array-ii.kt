class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        
       if (nums.size <= 2) {
        return nums.size
    }

    var count = 2

    for (i in 2 until nums.size) {
        if (nums[i] != nums[count - 2]) {
            nums[count] = nums[i]
            count++
        }
    }

    return count
    }
}