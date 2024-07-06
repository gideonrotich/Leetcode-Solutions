class Solution {
    func finalValueAfterOperations(_ operations: [String]) -> Int {
        var ans = 0

        for i in 0..<operations.count{
            if(operations[i] == "--X" || operations[i] == "X--"){
                ans -= 1
            }else if(operations[i] == "++X" || operations[i] == "X++"){
                ans += 1
            }
        }
        return ans
    }
}