/*
Coding Platform: Leetcode
Link to the problem: https://leetcode.com/explore/learn/card/recursion-i/255/recursion-memoization/1661/
*/
class Solution {
    int a[] = new int[31];
    Solution(){
        a[0] = 0;
        a[1] = 1;
    }
    public int fib(int n) {
        if(n==0 || a[n]>0) return a[n];
        a[n] = fib(n-1)+fib(n-2);
        return a[n];
    }
}