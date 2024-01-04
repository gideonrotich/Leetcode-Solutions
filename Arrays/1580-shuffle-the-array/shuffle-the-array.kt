class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
         val result = IntArray(nums.size)
        var index = 0

        // Iterate through the array and construct the result array
        for (i in 0 until n) {
            result[index++] = nums[i]     // Add x_i
            result[index++] = nums[i + n] // Add y_i
        }

        return result


    }
}