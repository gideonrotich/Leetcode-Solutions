class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val list = mutableListOf<Int>()
        
        val listTwo = mutableListOf<Int>()

        for(i in nums1){
            if(nums2.contains(i)){
                list.add(i)
            }
        }

        for(i in nums2){
            if(nums1.contains(i)){
                listTwo.add(i)
            }
        }

        return intArrayOf(list.size,listTwo.size)
    }
}