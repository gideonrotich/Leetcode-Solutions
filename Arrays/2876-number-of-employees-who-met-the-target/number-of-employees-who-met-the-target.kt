class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var pos = 0
       
       for(i in hours.indices){
           if(hours[i] >= target){
               pos++
           }
       }
        return pos
    }
}