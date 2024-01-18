class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val morseCodes = arrayOf(
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--.."
        )

        val transformations = HashSet<String>()

        for (word in words) {
            val transformation = StringBuilder()

            for (char in word) {
                transformation.append(morseCodes[char - 'a'])
            }

            transformations.add(transformation.toString())
        }

        return transformations.size
    }
}