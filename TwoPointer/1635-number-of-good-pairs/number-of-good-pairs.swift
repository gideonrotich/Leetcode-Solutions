class Solution {
    func numIdenticalPairs(_ nums: [Int]) -> Int {
        var ans = 0

        for i in 0..<nums.count{
            for j in (i+1)..<nums.count{
                if(nums[i] == nums[j]){
                    ans += 1
                }
            }
        }
        return ans
    }
}