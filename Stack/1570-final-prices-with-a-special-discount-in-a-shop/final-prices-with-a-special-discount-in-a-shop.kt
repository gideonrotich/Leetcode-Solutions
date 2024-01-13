class Solution {
    fun finalPrices(prices: IntArray): IntArray {
      val result = IntArray(prices.size)

        for (i in prices.indices) {
            var discount = 0
            for (j in i + 1 until prices.size) {
                if (prices[j] <= prices[i]) {
                    discount = prices[j]
                    break
                }
            }
            result[i] = prices[i] - discount
        }

        return result
    }
}