class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        var count = 0
        while(count < k){
            val test = nums.sliceArray(nums.size-1 until nums.size) + nums.sliceArray(0 until nums.size-1)

            for(i in nums.indices){
                nums[i] = test[i]
            }

            count++
        }
    }
}