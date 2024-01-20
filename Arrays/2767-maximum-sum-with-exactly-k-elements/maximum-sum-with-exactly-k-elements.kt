class Solution {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        var result = mutableListOf<Int>()
        val max = nums.maxOrNull() ?: 0

        val test = max + k

            for(k in max until test ){
                result.add(k)
            }

        return result.sum()
    }
}