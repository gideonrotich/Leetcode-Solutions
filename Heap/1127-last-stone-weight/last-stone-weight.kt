class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val maxHeap = PriorityQueue<Int>(compareBy{-it})

        stones.forEach{
            maxHeap.offer(it)
        }

        while(maxHeap.size>1){
            val highest = maxHeap.poll()
            val second = maxHeap.poll()

            val remaining = highest-second

            if(remaining >0){
                maxHeap.offer(remaining)
            }
        }

        return if(maxHeap.isEmpty())0 else maxHeap.peek()
    }
}