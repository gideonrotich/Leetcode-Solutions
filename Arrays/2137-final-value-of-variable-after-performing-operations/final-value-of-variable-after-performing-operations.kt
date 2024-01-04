class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var pos = 0
       
       for(num in operations){
           if( num == "++X" || num == "X++"){
               pos++
           }else if(num == "--X" || num == "X--"){
               pos--
           }
       }
       return pos
    }
}