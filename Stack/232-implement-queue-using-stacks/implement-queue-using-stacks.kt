class MyQueue() {

    val stack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
    }

    fun pop(): Int {
        return stack.removeAt(0)
    }

    fun peek(): Int {
        return stack[0]
    }

    fun empty(): Boolean {
        return stack.isEmpty()
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */