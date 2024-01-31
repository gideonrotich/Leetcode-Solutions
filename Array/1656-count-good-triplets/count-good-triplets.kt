class Solution {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
          val n = arr.size
        var count = 0

        for (i in 0 until n - 2) {
            for (j in i + 1 until n - 1) {
                for (k in j + 1 until n) {
                    val condition1 = Math.abs(arr[i] - arr[j]) <= a
                    val condition2 = Math.abs(arr[j] - arr[k]) <= b
                    val condition3 = Math.abs(arr[i] - arr[k]) <= c

                    if (condition1 && condition2 && condition3) {
                        count++
                    }
                }
            }
        }

        return count
    }
}