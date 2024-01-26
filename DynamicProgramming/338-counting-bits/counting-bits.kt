class Solution {
    fun countBits(n: Int): IntArray {
        val array = IntArray(n+1)

        // array[0] = 0

        for(i in 0..n){
            array[i] = array[i/2] + (i%2)
        }

        return array
    }
}