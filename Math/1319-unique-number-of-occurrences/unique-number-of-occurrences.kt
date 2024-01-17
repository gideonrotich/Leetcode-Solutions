class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
      val map = HashMap<Int,Int>()

      arr.forEach{
          map[it] = map.getOrDefault(it,0) + 1
      }

      val list = map.values.sorted()

      for(i in 0 until list.size -1){
          if(list[i] == list[i+1]){
              return false
          }

          }
           return true
      }
    
}