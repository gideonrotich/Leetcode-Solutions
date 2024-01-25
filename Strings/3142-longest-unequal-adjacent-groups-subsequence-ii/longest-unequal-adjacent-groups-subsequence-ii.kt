class Solution {
    fun getWordsInLongestSubsequence(n: Int, words: Array<String>, groups: IntArray): List<String> {
       var max = 1
        var end = 0
        val dp = IntArray(n)
        val last = IntArray(n) { -1 }
        val subs = mutableMapOf<Int, MutableList<Int>>()

        dp[0] = 1
        last[0] = -1
        subs[words[0].length] = mutableListOf(0)

        for (i in 1 until n) {
            val l = words[i].length
            dp[i] = 1
            last[i] = -1

            if (subs.containsKey(l)) {
                val temp = subs[l]!!
                for (j in temp) {
                    if (groups[i] != groups[j] && distance(words, i, j) == 1) {
                        if (dp[i] < dp[j] + 1) {
                            dp[i] = dp[j] + 1
                            last[i] = j
                        }
                    }
                }
                temp.add(i)
                subs[l] = temp
            } else {
                subs[l] = mutableListOf(i)
            }

            if (dp[i] > max) {
                max = dp[i]
                end = i
            }
        }

        val res = mutableListOf<String>()

        var curr = end
        while (curr != -1) {
            res.add(0, words[curr])
            curr = last[curr]
        }

        return res
    }

    private fun distance(words: Array<String>, i: Int, j: Int): Int {
        // input validations
        if (words[i].length == words[j].length) {
            var d = 0
            for (k in words[i].indices) {
                if (words[i][k] != words[j][k]) {
                    d++
                }
            }
            return d
        }
        return -1
    }
    
}