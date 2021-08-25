/* 
Platform: Codechef
Problem code: FLOW006
Link: https://www.codechef.com/problems/FLOW006
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
		int t;
		if(sc.hasNextInt()){
		    t=sc.nextInt();
		    while(t-- > 0){
		        if(sc.hasNextInt()){
		            int n,sum=0;
		            n = sc.nextInt();
		            while(n>0){
		                sum+=n%10;
		                n/=10;
		            }
		        System.out.println(sum);
		        }
		        else return;
		    }
		}
		else return;
	}
}
