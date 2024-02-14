class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
        val positive = mutableListOf<Int>()
    val negative = mutableListOf<Int>()
    val mixed = mutableListOf<Int>()

    for(i in nums.indices){
        if(nums[i].toString().contains("-")){
            negative.add(nums[i])
        }else{
            positive.add(nums[i])
        }
    }

    val pos = positive.toIntArray()
    val neg = negative.toIntArray()

    for(i in pos.indices){
        mixed.add(pos[i])
        mixed.add(neg[i])
    }

    return mixed.toIntArray()
    }
}