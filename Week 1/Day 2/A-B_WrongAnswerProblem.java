/*
Coding Platform: Codechef
Problem Code: CIELAB
Link to the problem: https://www.codechef.com/problems/CIELAB
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
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a-b;
		if(ans%10==9)
		    ans -= 1;
		else
		    ans += 1;
		System.out.println(ans);
	}
}
