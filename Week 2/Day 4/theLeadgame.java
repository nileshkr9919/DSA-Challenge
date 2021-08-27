/*Coding platform: Codechef
Problem code: TLG
Link: https://www.codechef.com/problems/TLG
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
		if(sc.hasNextInt()){
		    n = sc.nextInt();
		    int lead=0;
		    int player1=0, player2=0;
		    for(int i=1;i<=n;i++){
		        if(sc.hasNextInt())
		        player1 += sc.nextInt();
		        else return;
		        if(sc.hasNextInt())
		        player2 += sc.nextInt();
		        else return;
		        if(Math.abs(player1-player2)>Math.abs(lead))
		        lead = player1 - player2;
		    }
		    if(lead<0)
		    System.out.println(2 + " " + (lead * -1));
		    else
		    System.out.println(1 + " " + lead);
		}
		else return;
	}
}
