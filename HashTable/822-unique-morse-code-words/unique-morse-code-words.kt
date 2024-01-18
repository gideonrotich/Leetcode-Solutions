class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val morseCodes = arrayOf(
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--.."
        )

        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        val transformations = HashSet<String>()

        for (word in words) {
            val transformation = StringBuilder()

            for (char in word) {
                transformation.append(morseCodes[alphabet.indexOf(char)])
            }

            transformations.add(transformation.toString())
        }

        return transformations.size

        //solution 2
        // val alphabet = "abcdefghijklmnopqrstuvwxyz";
        // val morseCodeAlphabet = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        // val morseWords = mutableSetOf<String>()

        // for (word in words) {
        //     var wordString = ""

        //     for (letter in word) {
        //         wordString += morseCodeAlphabet[alphabet.indexOf(letter)]
        //     }

        //     morseWords.add(wordString)
        // }

        // return morseWords.size
    }
}