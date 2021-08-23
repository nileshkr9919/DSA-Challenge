/* 
Coding Platform: Codechef
Problem Code: CHGM1
Link to the problem: https://www.codechef.com/problems/CHGM1

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
		int n,t;
		int[] arr;
		t = sc.nextInt();
		while(t-- > 0){
		    n = sc.nextInt();
		    arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		    
        int max = Integer.MIN_VALUE;
        int max_end = 0;
 
        for (int i = 0; i < n; i++)
        {
            max_end = max_end + arr[i];
            if (max < max_end)
                max = max_end;
            if (max_end < 0)
                max_end = 0;
        }
        System.out.println(max);
		    
		}
	}
}
