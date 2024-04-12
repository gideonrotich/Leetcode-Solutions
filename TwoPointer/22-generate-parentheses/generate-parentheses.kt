class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        generate("", n, n, result)
        return result
    }

      private fun generate(s: String, left: Int, right: Int, result: MutableList<String>) {
        // Base case: if both left and right parentheses are used up
        if (left == 0 && right == 0) {
            result.add(s)
            return
        }
        
        // Add left parenthesis if there are remaining left parentheses
        if (left > 0) {
            generate(s + "(", left - 1, right, result)
        }
        
        // Add right parenthesis if there are more left parentheses than right parentheses
        if (right > left) {
            generate(s + ")", left, right - 1, result)
        }
    }
}