class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        val list = mutableListOf<Int>()

        for(i in nums2.indices){
            if(nums1.contains(nums2[i])){
                list.add(nums2[i])
            }
        }

        val minimum = list.minOrNull() ?: -1

        return minimum
    }
}