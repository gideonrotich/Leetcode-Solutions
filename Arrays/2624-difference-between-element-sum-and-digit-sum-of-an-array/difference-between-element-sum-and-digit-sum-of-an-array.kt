class Solution {
    fun differenceOfSum(nums: IntArray): Int {
        val sum = nums.sum()

        val list = mutableListOf<Int>()

        for(i in nums){
            val test = i.toString()
            for(k in test){
                list.add(k.toString().toInt())

            }
        }
        val listsum = list.sum()
        
        return sum-listsum
    }
}