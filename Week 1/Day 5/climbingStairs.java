/*
Coding Platform: Leetcode
Problem code: 70
Link to the problem: https://leetcode.com/problems/climbing-stairs/
*/

class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        else{
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            
            for(int i=3;i<arr.length;i++)
                arr[i] = arr[i-1] + arr[i-2];
            
            return arr[n];
            
        }
    }
}