class Solution {
    fun maxProduct(nums: IntArray): Int {
       var result = 0

       for(i in nums.indices){
           for(j in i+1 until nums.size){
               val test = (nums[i]-1)*(nums[j]-1)
               result = maxOf(result,test)
           }
       } 

       return result
    }
}