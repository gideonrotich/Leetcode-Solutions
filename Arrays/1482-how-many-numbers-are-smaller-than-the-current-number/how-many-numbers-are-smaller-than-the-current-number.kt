class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        var array =  IntArray(nums.size)
    
        for(i in 0 until nums.size){
            for(j in nums.indices){
                if(j != i && nums[j]<nums[i]){
                        array[i]++
                }
            }
        }
        return array
    }
}