/*
Platform: Codechef
Problem Code: CHEFDETE
Link: https://www.codechef.com/problems/CHEFDETE
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
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
		    map.put(i+1,sc.nextInt());
		}
		for(int i : map.keySet())
		    if(!map.values().contains(i))
		        System.out.print(i + " ");
		System.out.println();
	}
}
