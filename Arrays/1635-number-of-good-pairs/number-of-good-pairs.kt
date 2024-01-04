class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var pos = 0

        for (i in 0 until nums.size){
            for(j in i+1 until nums.size){
               if(nums[i] == nums[j]){
                   pos++
               }
            }
        }
        return pos
    }
}