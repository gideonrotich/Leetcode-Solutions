class Solution {
    fun reversePrefix(word: String, ch: Char): String {
       var test = 0
    val list = mutableListOf<String>()

    for((i,j) in word.withIndex()){
        if(j.toString() == ch.toString()){
            test = i
            break
        }
    }
    val mute = mutableListOf<String>()

   for(i in 0..test){
        mute.add(word[i].toString())
    }

    list.add(mute.joinToString("").reversed())

    for (i in test+1 until word.length){
        list.add(word[i].toString())
    }

    return list.joinToString("")
    }
}