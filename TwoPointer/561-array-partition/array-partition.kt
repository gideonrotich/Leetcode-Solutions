class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var sum = 0 

        for(i in nums.indices step 2){
            sum += nums[i]
        }

        return sum
    }
}