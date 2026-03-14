class Solution {
    fun moveZeroes(nums: IntArray): Unit {
          var insertPos = 0
        
        for (num in nums) {
            if (num != 0) {
                nums[insertPos++] = num
            }
        }
        
        while (insertPos < nums.size) {
            nums[insertPos++] = 0
        }
    }
}