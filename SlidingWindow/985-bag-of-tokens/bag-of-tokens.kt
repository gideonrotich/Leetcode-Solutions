class Solution {
    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
          tokens.sort() // Sort the tokens array
        
        var score = 0
        var maxScore = 0
        var left = 0
        var right = tokens.size - 1
        
        var currentPower = power
        
        while (left <= right) {
            if (currentPower >= tokens[left]) {
                // Play token face-up
                score++
                currentPower -= tokens[left]
                left++
                maxScore = maxOf(maxScore, score)
            } else if (score > 0) {
                // Play token face-down
                score--
                currentPower += tokens[right]
                right--
            } else {
                // Cannot play any more tokens
                break
            }
        }
        
        return maxScore 
    }
}