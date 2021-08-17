/*
Coding Platform: Leetcode
Problem Code: 53
Link to the problem: https://leetcode.com/problems/maximum-subarray/
*/

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int maxSum = nums[0], maxSumEnd = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            maxSumEnd = Math.max(maxSumEnd + nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxSumEnd);
        }
        
        return maxSum;        
    }
}