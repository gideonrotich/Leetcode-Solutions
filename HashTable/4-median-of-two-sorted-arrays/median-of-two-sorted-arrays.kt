class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
           val merged = nums1.plus(nums2).sorted()
             val size = merged.size
             return if (size % 2 == 0) {
              (merged[size / 2 - 1].toDouble() + merged[size / 2].toDouble()) / 2.0
                 } else {
              merged[size / 2].toDouble()
               }}
}