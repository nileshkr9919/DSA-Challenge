/*
Platform: Leetcode
Problem Code: 13
Link: https://leetcode.com/problems/roman-to-integer/

*/

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int val = 0;
        int i = 0;
        while(i<s.length()){
            int a = map.get(s.charAt(i));
            if(i < s.length()-1) {
                int b = map.get(s.charAt(i+1));
                if(b > a){
                    a = b-a;
                    i++;
                }
            }
            val += a;
            i++;
        }
        return val;
    }
}