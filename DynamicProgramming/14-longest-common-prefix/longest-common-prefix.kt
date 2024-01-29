class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
       if(strs.isEmpty()){
           return ""
       }

       strs.sort()

       val first = strs[0]
       val last = strs[strs.size-1]

       val result = StringBuilder()

       for(i in first.indices){
           if(first[i] == last[i]){
               result.append(first[i])
           }else{
               break
           }
       }

       return result.toString()
    }
}