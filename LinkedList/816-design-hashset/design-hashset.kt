class MyHashSet() {

    val list = LinkedList<Int>()

    fun add(key: Int) {
        list.push(key)
    }

    fun remove(key: Int) {
         list.removeAll{it == key}
    }

    fun contains(key: Int): Boolean {
        return list.contains(key)
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */