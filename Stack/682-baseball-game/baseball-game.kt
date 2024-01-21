class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = Stack<Int>()

        for(i in operations){
            if(i.toIntOrNull() != null){
                stack.push(i.toInt())
            }else if(i == "C"){
                stack.removeAt(stack.size-1)
            }else if(i == "D"){
                val result = 2 * stack.elementAt(stack.size-1)
                stack.push(result)
            }else if(i == "+"){
                val last = stack.elementAt(stack.size-1)
                val secondLast = stack.elementAt(stack.size-2)
                val sum  = last + secondLast
                stack.push(sum)
            }
        }

        return stack.sum()
    }
}