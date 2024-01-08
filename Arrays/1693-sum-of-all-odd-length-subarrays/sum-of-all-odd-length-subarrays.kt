class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
      
      var count = 0

      for(i in arr.indices){
          for (k in i until arr.size step 2){
              for(j in i..k){
                  count += arr[j]
              }
          }
      }

      return count


    }
}