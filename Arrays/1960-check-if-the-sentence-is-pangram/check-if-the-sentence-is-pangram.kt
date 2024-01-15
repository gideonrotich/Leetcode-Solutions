class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        val length = 26
        val set = HashSet<Char>()
        var result  = false

        sentence.forEach{it ->
            set.add(it)
        }

        if(set.size >= length){
            result = true
        }else{
            result = false
        }

        return result
    }
}