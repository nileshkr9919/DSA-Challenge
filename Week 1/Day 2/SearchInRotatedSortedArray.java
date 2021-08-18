/*
Coding Platform: Leetcode
Problem Code: 33
Link to the problem: https://leetcode.com/problems/search-in-rotated-sorted-array/
*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]<nums[right]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        int k = left;
        left = 0;
        right = nums.length-1;
        
        if(target >= nums[k] && target <= nums[right]){
            left = k;
        }
        else{
            right = k - 1;
        }
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}