class Solution {
    fun firstUniqChar(s: String): Int {
           val map = HashMap<Char, Int>()
        
        // Count occurrences of each character in the string
        for (char in s) {
            map[char] = map.getOrDefault(char, 0) + 1
        }

        // Find the index of the first unique character
        for ((index, char) in s.withIndex()) {
            if (map[char] == 1) {
                return index
            }
        }

        return -1
    }
}