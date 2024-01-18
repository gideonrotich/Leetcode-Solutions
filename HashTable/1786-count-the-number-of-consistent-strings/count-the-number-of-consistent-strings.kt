class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {

        val testSet = HashSet<Char>()
        allowed.forEach{ testSet.add(it)}

        var count = 0

        for (word in words) {
            var isConsistent = true

            for (char in word) {
                if (!testSet.contains(char)) {
                    isConsistent = false
                    break
                }
            }

            if (isConsistent) {
                count++
            }
        }

        return count
    }
}