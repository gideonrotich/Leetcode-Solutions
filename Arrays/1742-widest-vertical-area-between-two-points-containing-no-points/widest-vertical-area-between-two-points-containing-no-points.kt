class Solution {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        var max = 0
        val list = mutableListOf<Int>()

        for(i in points){
            list.add(i[0])
        }

       list.sort()

       val ren = list.toIntArray()

        var dar = 0

        for(k in 0 until ren.size -1){
            val result = ren[k+1] - ren[k]
            dar = maxOf(dar,result)
        }

        return dar
    }
}