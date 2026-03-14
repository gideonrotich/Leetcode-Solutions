class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()

        var child = 0

        for (cookie in s) {
            if (child < g.size && cookie >= g[child]) {
                child++
            }
        }

        return child
    }
}