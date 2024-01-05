class Solution {
     fun createDecoder(key: String): HashMap<Char, Char> {
        var decoderMap = hashMapOf<Char, Char>()
        var c = 'a'
        for (i in key){
            if (!decoderMap.containsKey(i) && i != ' '){
                decoderMap.put(i,c)
                c++
            }
        }
        return decoderMap
    }

    fun decodeMessage(key: String, message: String): String {
         var decoded = ""
         var decoder = createDecoder(key)
         message.forEach {
             if (it != ' '){
                 decoded += decoder.get(it)
             } else {
                 decoded += ' '
             }
         }
         return decoded
    }
}