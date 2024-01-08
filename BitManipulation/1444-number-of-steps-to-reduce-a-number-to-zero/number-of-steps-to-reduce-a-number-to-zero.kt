class Solution {
    fun numberOfSteps(num: Int): Int {
        var count = 0
        var current = num

        while(current> 0){
            if(current % 2 == 0){
                //divide by two
                current /= 2
            }
            else{
                //subtract one from current
                current -= 1
            }
            //increase the counter
            count++
        }
        return count

    }
}