/*
Coding Platform: Leetcode
Link to the problem: https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/
*/

class Solution {
    private int a=0;
    private int b;
    public void reverseString(char[] s) {
        b=s.length-a-1;
        if(a>b){
            System.out.println(Arrays.toString(s));
        }
        else{
            char t=s[a];
            s[a]=s[b];
            s[b]=t;
            a++;
            b--;
            reverseString(s);
        }
    }
}