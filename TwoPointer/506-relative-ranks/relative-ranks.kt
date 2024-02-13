class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val map = HashMap<Int,String>()
        val list = mutableListOf<String>()

        val array = score.sortedDescending()

        for(i in array.indices){
            map[array[i]] = when (i) {
                 0 -> "Gold Medal"
                 1 -> "Silver Medal"
                 2 -> "Bronze Medal"
                 else -> (i+1).toString()
            }
        }

        for(i in score.indices){
            list.add(map[score[i]]!!)
        }

        return list.toTypedArray()
    }
}