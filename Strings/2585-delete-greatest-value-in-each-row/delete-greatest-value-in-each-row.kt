class Solution {
    fun deleteGreatestValue(grid: Array<IntArray>): Int {
            var result = 0

        // Convert each row to a MutableList
        val mutableGrid = grid.map { it.toMutableList() }

        while (mutableGrid.isNotEmpty() && mutableGrid[0].isNotEmpty()) {
            val maxValues = mutableListOf<Int>()

            for (row in mutableGrid) {
                if (row.isNotEmpty()) {
                    val maxValueIndex = row.indices.maxByOrNull { row[it] }!!
                    maxValues.add(row[maxValueIndex])
                    row[maxValueIndex] = row.last()
                    row.removeAt(row.lastIndex)
                }
            }

            result += maxValues.maxOrNull() ?: 0
        }

        return result
    }
}