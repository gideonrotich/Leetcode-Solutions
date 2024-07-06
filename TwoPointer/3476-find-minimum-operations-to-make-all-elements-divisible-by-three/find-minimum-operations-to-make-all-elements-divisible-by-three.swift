class Solution {
    func minimumOperations(_ nums: [Int]) -> Int {
        var ans = 0

        for num in nums{
            let remainder = num % 3

            if(remainder == 1){
                ans += 1
            }else if (remainder == 2){
                ans += 1
            }
        }
        return ans
    }
}