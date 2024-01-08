class Solution {
    fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {
        var count = 0

        for(i in 0 until nums.size){
            val bits = Integer.bitCount(i)
            if(bits == k){
                count += nums[i]
            }
        }
        return count
    }
}