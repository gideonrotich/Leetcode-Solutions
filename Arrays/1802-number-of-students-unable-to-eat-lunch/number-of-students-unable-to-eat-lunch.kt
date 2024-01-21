class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
     val stack = Stack<Int>()

        for(index in sandwiches.size-1 downTo 0)
            stack.push(sandwiches[index])

        var index = 0
        while (true){

            if(index>students.size-1){
                index = 0
            }

            if(stack.empty() || !students.contains(stack.peek()))
                break

            if(students[index]==stack.peek()) {
			   //update the students array to reflect the students who have eaten the lunch.
                students[index] = -1
                stack.pop()
            }

            index++
        }

        return stack.size
    }
}