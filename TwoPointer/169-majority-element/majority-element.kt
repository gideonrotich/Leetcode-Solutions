class Solution {
    fun majorityElement(nums: IntArray): Int {
        var max = 0
        

        val map = HashMap<Int,Int>()

        for(i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
        }

       return map.maxBy{it.value}.key

       
        
    }
}