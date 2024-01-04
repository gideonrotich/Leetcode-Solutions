class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var pos = 0

        for(i in accounts){
            pos = maxOf(pos, i.sum())
        }

        return pos
    }
}