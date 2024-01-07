class Solution {
    fun numberGame(nums: IntArray): IntArray {
         val arr = mutableListOf<Int>()
        
        nums.sort()

        for (i in nums.indices step 2) {
            arr.add(nums[i + 1])
            arr.add(nums[i])
        }

        return arr.toIntArray()
        
    }
}