class Solution {
    fun customSortString(order: String, s: String): String {
          val list = mutableListOf<String>()

        // Add characters from s that are in order
        for (i in order.indices) {
            if (s.contains(order[i])) {
                val occurrences = s.count { it == order[i] }
                list.add(order[i].toString().repeat(occurrences))
            }
        }

        // Add characters from s that are not in order
        for (i in s.indices) {
            if (!order.contains(s[i])) {
                list.add(s[i].toString())
            }
        }

        return list.joinToString("")
    }
}