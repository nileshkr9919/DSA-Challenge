/*
Coding Platform: Geeksforgeeks
Link to the problem: https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1#
*/

class Solution {
    
    public String reverse(String S){
        //code here
        String r="";
        Stack st = new Stack();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        while(!st.empty())
            r = r + st.pop();
            
        return r;
    }

}