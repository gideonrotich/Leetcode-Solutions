class Solution {
    fun reverseWords(s: String): String {
        var answer = StringBuilder()
        val words = s.split(" ")
        for(word in words){

            var array = word.toCharArray()
            var left = 0
            var right = word.length-1

            while(left<right){
                val temp = array[left]
                array[left] = array[right]
                array[right] = temp
                left++
                right--
            }
            answer.append(String(array))
            answer.append(" ")

        }

        return answer.toString().trim()
    }
}