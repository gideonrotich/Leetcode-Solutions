class Solution {
    fun minimumSum(num: Int): Int {
        val array  = num.toString().toCharArray()
        array.sort()

        var one = ""
        var two = ""

        for(i in array.indices){
            if(i % 2 == 0){
                one += array[i]
            }else{
                two += array[i]
            }
        }

        return one.toInt() + two.toInt()
    }
}