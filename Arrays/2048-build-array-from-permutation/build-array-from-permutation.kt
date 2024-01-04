class Solution {
    fun buildArray(nums: IntArray): IntArray {
      var n = nums.size
      var pos = IntArray(n)

      for(i in 0 until nums.size){
          pos[i] = nums[nums[i]]
      }

      return pos

    }
}