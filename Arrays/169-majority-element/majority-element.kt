class Solution {
    fun majorityElement(nums: IntArray): Int {
       val occ = HashMap<Int, Int>()
        nums.forEach {
            occ.put(it, occ.getOrDefault(it, 0) + 1)
        }
        return occ.maxBy { it.value }.key
    
    }
}