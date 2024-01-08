class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var altitude = 0
        var maxAltitude = 0

        for (value in gain) {
            altitude += value
            maxAltitude = maxOf(maxAltitude, altitude)
        }

        return maxAltitude
    }
}