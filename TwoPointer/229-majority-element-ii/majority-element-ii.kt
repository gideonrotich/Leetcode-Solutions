class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val map = HashMap<Int,Int>()
        val count = nums.size/3
        var result = mutableListOf<Int>()

        for(i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
        }

        for((key,value) in map){
            if(value>count){
                result.add(key)
            }
        }

        return result
    }
}