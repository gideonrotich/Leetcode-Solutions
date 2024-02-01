class Solution {
    fun separateDigits(nums: IntArray): IntArray {
         val result = mutableListOf<Int>()

        for (num in nums) {
            val digits = mutableListOf<Int>()
            var n = num

            // Separate digits of the current number
            while (n > 0) {
                digits.add(n % 10)
                n /= 10
            }

            // Add the digits in reverse order to maintain the original order
            result.addAll(digits.reversed())
        }

        return result.toIntArray()
    }
}