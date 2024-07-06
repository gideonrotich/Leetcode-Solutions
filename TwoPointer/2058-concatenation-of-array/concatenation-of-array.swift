class Solution {
    func getConcatenation(_ nums: [Int]) -> [Int] {
       var count = nums.count

        var ans = [Int](repeating:0 ,count : 2*count)
       for i in 0..<count{
            ans[i] = nums[i]
            ans[i+count] = nums[i]
       }

       return ans
    }
}