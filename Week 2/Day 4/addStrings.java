/*Coding platform: Leetcode
Problem code: 415
Link: https://leetcode.com/problems/add-strings/
*/
class Solution {
    public String addStrings(String num1, String num2) {
        int c1 = num1.length() - 1;
        int c2 = num2.length() - 1;
        String res = "";
        int sum;
        int carry = 0;
        while(c1>=0 || c2>=0){
            sum = carry;
            if(c1>=0)
                sum += Integer.parseInt(String.valueOf(num1.charAt(c1))); 
            if(c2>=0)
                sum += Integer.parseInt(String.valueOf(num2.charAt(c2)));
            c1--;
            c2--;
            
            carry = sum/10;
            
            res = (sum%10) + res;
            
        }
        if(carry>0)
            res = carry + res;
        return res;
    }
}