class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
         var count = 0

        for (start in arr.indices) {
            for (end in start until arr.size step 2) {
                for (i in start..end) {
                    count += arr[i]
                }
            }
        }

        return count


    }
}