class Solution {
    fun pivotInteger(n: Int): Int {
           val map = HashMap<Int, Boolean>()

    val list = (1..n).toList().toIntArray()

    for (i in list.indices) {
        map[list[i]] = checkNums(list[i], n)
    }

    for ((key, value) in map) {
        if (value == true) {
            return key
        }
    }


    return -1
    }

    fun checkNums(i: Int, n: Int): Boolean {
    val one = (1..i).toList()
    val sum_one = one.fold(0) { a, b -> a + b }

    val two = (i..n).toList()
    val sum_two = two.fold(0) { a, b -> a + b }

    if (sum_one == sum_two) {
        return true
    }

    return false
}
}