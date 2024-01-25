class Solution {
    fun longestPalindrome(s: String): String {
          if (s.isEmpty()) {
            return ""
        }

        val n = s.length
        var start = 0
        var maxLen = 1

        val dp = Array(n) { BooleanArray(n) }

        // All substrings of length 1 are palindromes
        for (i in 0 until n) {
            dp[i][i] = true
        }

        // Check substrings of length 2
        for (i in 0 until n - 1) {
            if (s[i] == s[i + 1]) {
                dp[i][i + 1] = true
                start = i
                maxLen = 2
            }
        }

        // Check substrings of length 3 or more
        for (len in 3..n) {
            for (i in 0 until n - len + 1) {
                val j = i + len - 1

                if (dp[i + 1][j - 1] && s[i] == s[j]) {
                    dp[i][j] = true
                    start = i
                    maxLen = len
                }
            }
        }

        return s.substring(start, start + maxLen)
    }
}