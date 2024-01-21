class Solution {
    fun strStr(haystack: String, needle: String): Int {
         val haystackLength = haystack.length
        val needleLength = needle.length

        if (needleLength == 0) {
            return 0 // Return 0 if needle is an empty string
        }

        if (needleLength > haystackLength) {
            return -1 // Needle cannot be found in haystack if it's longer
        }

        for (i in 0..haystackLength - needleLength) {
            if (haystack.substring(i, i + needleLength) == needle) {
                return i // Found a match, return the starting index
            }
        }

        return -1
    }
}