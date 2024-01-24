class Solution {
    fun findTheDifference(s: String, t: String): Char {
        val list = mutableListOf<Char>()
        var result:Char = ' '

        for(char in t){
            list.add(char)
        }

        for(i in s.indices){
            if(list.contains(s[i])){
                list.remove(s[i])
            }
        }

        list.forEach{
            result = it
        }

        return result

    }
}