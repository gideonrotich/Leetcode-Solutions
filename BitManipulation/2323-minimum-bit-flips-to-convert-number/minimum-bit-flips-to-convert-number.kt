class Solution {
    fun minBitFlips(start: Int, goal: Int): Int {
        return (start xor goal).countOneBits()
    }
}