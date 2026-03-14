class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = nums1.toHashSet()
        return nums2.filter{ it in set1}.toSortedSet().toIntArray()
    }
}