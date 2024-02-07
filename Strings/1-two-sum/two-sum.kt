class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         var result = IntArray(2)
		for(i in nums.indices){
            for(j in i+1 until nums.size){
                if(nums[i]+nums[j] == target){
                    result =  intArrayOf(i,j)
                }
            }
            
        }
        
        return result
    }
}