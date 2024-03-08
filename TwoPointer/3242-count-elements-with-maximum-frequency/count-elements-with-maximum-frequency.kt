class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        val list = mutableListOf<Int>()

        for(i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
        }

        val max = map.maxBy{it.value}
        val maximum = max?.value ?: 0 

        for((key,value) in map){
            if(value == maximum){
                list.add(value)
            }
        }

        return list.sum()
    }
}