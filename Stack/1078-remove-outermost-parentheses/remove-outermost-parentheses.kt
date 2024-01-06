class Solution {
    fun removeOuterParentheses(s: String): String {
         val stack = mutableListOf<Char>()
        val result = StringBuilder()

        for (char in s) {
            if (char == '(') {
                // If stack is not empty, it means this '(' is not the outermost parenthesis.
                if (stack.isNotEmpty()) {
                    result.append(char)
                }
                stack.add(char)
            } else {
                // If stack is not empty, it means this ')' is not the outermost parenthesis.
                if (stack.size > 1) {
                    result.append(char)
                }
                stack.removeAt(stack.size - 1)
            }
        }

        return result.toString()
    }
}