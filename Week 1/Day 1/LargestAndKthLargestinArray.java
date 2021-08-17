/*
Coding Platform: Codechef
Problem Code: EXPCODE1
Link to the problem: https://www.codechef.com/problems/EXPCODE1/
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
		int n,k;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
		    n = sc.nextInt();
		    arr = new int[n];
		    for(int i=0;i<n;i++){
		        if(sc.hasNextInt())
		            arr[i] = sc.nextInt();
		        else
		            return;
		    }
		    if(sc.hasNextInt())
		        k = sc.nextInt();
		    else
		        return;
		    for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] < arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            System.out.println(arr[0]);
            System.out.println(arr[k-1]);
		}
		else return;
	}
}
