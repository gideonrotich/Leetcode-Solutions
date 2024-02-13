class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
      // Create a max heap to store scores along with their indices
        val maxHeap = PriorityQueue<Pair<Int, Int>>(compareBy { -it.first })

        // Populate the max heap with scores and their indices
        for (i in score.indices) {
            maxHeap.offer(score[i] to i)
        }

        // Create an array to store the ranks
        val result = Array(score.size) { "" }

        // Assign ranks based on heap ordering
        var rank = 1
        while (maxHeap.isNotEmpty()) {
            val (currScore, index) = maxHeap.poll()
            result[index] = when (rank) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> rank.toString()
            }
            rank++
        }

        return result
    }
}