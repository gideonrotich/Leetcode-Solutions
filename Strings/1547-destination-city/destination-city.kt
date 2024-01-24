class Solution {
    fun destCity(paths: List<List<String>>): String {
        val map = HashMap<String,String>()

        for(i in paths){
            map[i[0]] = i[1]
        }

        val keyList = map.keys.toList()

        val valueList = map.values.toList()

        val filteredValueList = valueList.filter { !keyList.contains(it) }

        return filteredValueList.joinToString(" ")
    }
}