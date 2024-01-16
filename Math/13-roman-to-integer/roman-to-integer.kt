class Solution {


    fun romanToInt(str: String): Int {
        
           val romanNumerals = mapOf('I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000)

        var result = 0

        for (i in str.indices) {
            val currValue = romanNumerals.getValue(str[i])
            if (i + 1 != str.length) {
                val nextValue = romanNumerals.getValue(str[i + 1])
                if ( currValue < nextValue) {
                   result -= currValue
                } else {
                    result += currValue
                }
            } else {
                result += currValue
            }
        }
        return result
    }


}