/*
Coding Platform: Leetcode
Problem Code: 1
Link to the problem: https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int t = 0;
        
        int[] arr = new int[2];
        
        for(int i=0;i<nums.length;i++){
            
            t = target - nums[i];
            
            if(map.containsKey(t)){
                arr[0] = map.get(t);
                arr[1] = i;
                
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}