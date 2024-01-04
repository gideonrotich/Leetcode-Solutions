class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = candies.maxOrNull() ?: 0
        val result = mutableListOf<Boolean>()

        for(num in 0 until candies.size){
            if(candies[num]+ extraCandies >= max){
                result.add(true)
            }else {
                result.add(false)
            }
        }

        return result
    }
}