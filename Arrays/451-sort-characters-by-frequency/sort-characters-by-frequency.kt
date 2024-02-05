class Solution {
    fun frequencySort(s: String): String {
               val charCount = HashMap<Char, Int>()
        for (char in s) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }

        // Create a priority queue to sort characters based on frequency
        val maxHeap = PriorityQueue<Char> { c1, c2 ->
            charCount[c2]!! - charCount[c1]!!
        }
        maxHeap.addAll(charCount.keys)

        // Build the sorted string based on frequency
        val result = StringBuilder()
        while (maxHeap.isNotEmpty()) {
            val char = maxHeap.poll()
            repeat(charCount[char]!!) {
                result.append(char)
            }
        }

        return result.toString()


    }
}