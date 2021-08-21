/* 
Coding Platform: Leetcode
Problem Code: 128
Link: https://leetcode.com/problems/longest-consecutive-sequence/
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0)
            return 0;
        Arrays.sort(nums);
        HashMap<Integer,Boolean> map = new HashMap<>();
        int count = 0;
        int max_count = 0;
        for(int i : nums){
            if(map.containsKey(i-1)){
                map.put(i,false);
            }
            else    
                map.put(i,true);
        }

        int max = Integer.MIN_VALUE;
        
        for(int i : nums){
            if(map.get(i)==true){
                int len = 1;
                int tempVal = i + 1;
                while(map.containsKey(tempVal)){
                    len = len + 1;
                    tempVal = tempVal + 1;
                }
                if(max<len)
                    max = len;
            }
        }
       
        return max;
    }
}