class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
         val freqMap = HashMap<Int, Int>() // To store the frequency of each number
        val prevCount = HashMap<Int, Int>() // To store the count of valid triplets ending at the current number

        var tripletsCount = 0

        for (num in nums) {
            // Increment the count of valid triplets ending at the current number
            tripletsCount += prevCount.getOrDefault(num - diff, 0)

            // Increment the frequency of the current number
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1

            // Update the count of valid triplets that can end at the next number
            prevCount[num] = prevCount.getOrDefault(num, 0) + freqMap.getOrDefault(num - diff, 0)
        }

        return tripletsCount
    }
}