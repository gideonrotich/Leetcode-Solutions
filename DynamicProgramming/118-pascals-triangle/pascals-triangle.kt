class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        for(i in 0 until numRows){
            val row = mutableListOf<Int>()

            for(j in 0..i){
                if(j == 0 || j == i){
                    row.add(1)
                }else{
                    row.add(result[i-1][j-1] + result[i-1][j])
                }
            }

            result.add(row)
        }

        return result

    }
}