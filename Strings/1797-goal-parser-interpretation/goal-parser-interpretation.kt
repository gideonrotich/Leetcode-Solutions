class Solution {
    fun interpret(command: String): String {
        var result = StringBuilder()
        var last = ""
        
        for (c in command) {
            last += c
            if (last == "G") result.append("G")
            else if (last == "()") result.append("o")
            else if (last == "(al)") result.append("al")
            else continue
            last = ""
        }
        return result.toString()
    }
    
}