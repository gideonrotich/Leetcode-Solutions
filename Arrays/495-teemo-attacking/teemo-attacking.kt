class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var total = 0

        for (i in 0 until timeSeries.size - 1) {
            val gap = timeSeries[i + 1] - timeSeries[i]
            total += minOf(gap, duration)
        }
        return total + duration
    }
}