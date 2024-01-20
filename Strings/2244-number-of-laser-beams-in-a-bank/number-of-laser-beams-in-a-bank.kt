class Solution {
    fun numberOfBeams(bank: Array<String>): Int {
        var result = 0
        val map = HashMap<Int,Int>()


        fun countOnes(input: String): Int {
          var count = 0

         for (char in input) {
            if (char == '1') {
            count++
          }
         }

         return count
        }

        for((index,i) in bank.withIndex()){
            if(i.contains('1')){
                map[index] = countOnes(i)
            }
        }

        val figure = map.values.toIntArray()

        // for(i in 0 until figure.size -1){
        //     result += figure[i] * figure[i+1]
        // }

        for((current,next) in map.values.zipWithNext()){
            result += current * next
        }

        return result
    }
}