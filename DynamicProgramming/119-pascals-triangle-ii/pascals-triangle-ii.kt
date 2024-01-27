class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val result = mutableListOf<List<Int>>()

        for(i in 0..rowIndex){
            val row = mutableListOf<Int>()

            for(j in 0..i){
                if(j == 0 || j == i){
                    row.add(1)
                }else{
                    row.add(result[i-1][j-1]+result[i-1][j])
                }
            }
            result.add(row)
        }

        return result[rowIndex]
    }
}