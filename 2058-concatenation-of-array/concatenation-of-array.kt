class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        
        //using the spread operator
        val array = intArrayOf(*nums,*nums)

        return array
    }
}