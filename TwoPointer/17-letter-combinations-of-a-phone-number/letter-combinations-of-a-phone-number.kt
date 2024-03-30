class Solution {
    fun letterCombinations(digits: String): List<String> {
         // Define mapping of digits to letters
    val map = mapOf(
        '2' to listOf('a', 'b', 'c'),
        '3' to listOf('d', 'e', 'f'),
        '4' to listOf('g', 'h', 'i'),
        '5' to listOf('j', 'k', 'l'),
        '6' to listOf('m', 'n', 'o'),
        '7' to listOf('p', 'q', 'r', 's'),
        '8' to listOf('t', 'u', 'v'),
        '9' to listOf('w', 'x', 'y', 'z')
    )

    val result = mutableListOf<String>()

    // Define recursive function
    fun generateCombinations(combination: String, remainingDigits: String) {
        if (remainingDigits.isEmpty()) {
            result.add(combination)
            return
        }

        val currentDigit = remainingDigits[0]

        val letters = map[currentDigit] ?: error("Invalid digit: $currentDigit")

        for (letter in letters) {
            generateCombinations(combination + letter, remainingDigits.substring(1))
        }
    }

    // Call recursive function with initial values
    if (digits.isNotEmpty()) {
        generateCombinations("", digits)
    }

    return result
    }
}