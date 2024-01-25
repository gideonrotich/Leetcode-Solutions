class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0

        for(i in startTime.indices){
            val range = startTime[i]..endTime[i]
            if(range.contains(queryTime)){
                count++
            }
        }

        return count
    }
}