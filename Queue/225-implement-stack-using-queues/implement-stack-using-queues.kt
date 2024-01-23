class MyStack() {

    val queue = LinkedList<Int>()

    fun push(x: Int) {
        queue.offer(x)
        
    }

    fun pop(): Int {
        return queue.removeLast()
    }

    fun top(): Int {
        return queue.peekLast()
    }

    fun empty(): Boolean {
        return queue.size == 0
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */