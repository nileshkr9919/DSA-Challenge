/*
Coding Platform: Codechef
Problem code: THESAV
Link: https://www.codechef.com/problems/THESAV
*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		String s;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
		    Stack<Character> st = new Stack<>();
		    s = sc.next();
		    for(int i=s.length()-1;i>=0;i--){
		        if(s.charAt(i)=='0')
		            st.push('0');
		        else{
		            if(!st.isEmpty())
		                st.pop();
		            if(!st.isEmpty())
		                st.pop();
		        }
		    }
		    
		    if(st.isEmpty())
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    
		    
		}
	}
}
