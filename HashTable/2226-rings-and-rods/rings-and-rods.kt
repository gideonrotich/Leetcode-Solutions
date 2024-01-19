class Solution {
    fun countPoints(rings: String): Int {
       val map = HashMap<Char, MutableSet<Char>>()

        for (i in rings.indices step 2) {
            val color = rings[i]
            val rod = rings[i + 1]

            map.computeIfAbsent(rod) { mutableSetOf() }.add(color)
        }

        var count = 0
        for (colors in map.values) {
            if (colors.size == 3) {
                count++
            }
        }

        return count
    }
}