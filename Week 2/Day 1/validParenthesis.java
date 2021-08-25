/*
Coding Platform: Leetcode
Problem Code: 20
Link: https://leetcode.com/problems/valid-parentheses/
*/

class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        Stack st = new Stack();
        
        for(int i=0;i<s.length();i++){
            if(map.keySet().contains(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else{
                if(!st.empty() && map.get(st.peek())==s.charAt(i)){
                    st.pop();
                }
                else
                    return false;
            }
        }
        return st.empty();
    }
}