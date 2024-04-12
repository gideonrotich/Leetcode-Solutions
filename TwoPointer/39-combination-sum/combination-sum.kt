class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        backtrack(candidates, target, 0, mutableListOf(), result)
        return result
    }
        private fun backtrack(candidates: IntArray, target: Int, start: Int, combination: MutableList<Int>, result: MutableList<List<Int>>) {
        if (target < 0) return // If target becomes negative, backtrack
        if (target == 0) {
            result.add(ArrayList(combination)) // If target is reached, add combination to result
            return
        }
        
        for (i in start until candidates.size) {
            combination.add(candidates[i]) // Add current candidate to the combination
            backtrack(candidates, target - candidates[i], i, combination, result) // Recur with the remaining target and start from the current index
            combination.removeAt(combination.size - 1) // Remove the last added element to backtrack
        }
    }
}