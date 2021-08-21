/*
Coding Platform: Coddechef
Problem Code: GOOGOL05
Link to the problem: https://www.codechef.com/problems/GOOGOL05
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
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    String input = sc.next();
		    if(map.containsKey(input)){
		        map.put(input,map.get(input)+1);
		    }
		    else{
		        map.put(input,1);
		    }
		}
		
		ArrayList<String> sortedKeys
            = new ArrayList<String>(map.keySet());
 
        Collections.sort(sortedKeys);
 
        for (String x : sortedKeys)
            System.out.println(x + " " + map.get(x));
	}
}