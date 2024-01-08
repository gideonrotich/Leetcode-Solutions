class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
         val n = encoded.size + 1
        val arr = IntArray(n)
        arr[0] = first

        for (i in 1 until n) {
            arr[i] = arr[i - 1] xor encoded[i - 1]
        }

        return arr
    }
}