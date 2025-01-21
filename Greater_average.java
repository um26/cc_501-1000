// You are given 
// 3
// 3 numbers 
// A
// ,
// B
// ,
// A,B, and 
// C
// C.

// Determine whether the average of 
// A
// A and 
// B
// B is strictly greater than 
// C
// C or not?

// NOTE: Average of 
// A
// A and 
// B
// B is defined as 
// (
// A
// +
// B
// )
// 2
// 2
// (A+B)
// ​
//  . For example, average of 
// 5
// 5 and 
// 9
// 9 is 
// 7
// 7, average of 
// 5
// 5 and 
// 8
// 8 is 
// 6.5
// 6.5.


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t=s.nextInt();
	    for(int i=0;i<t;i++){
	        int a= s.nextInt();
	        int b= s.nextInt();
	        int c= s.nextInt();
	        if((a+b)*0.5 > c) System.out.println("Yes");
	        else System.out.println("No");
	    }
	}
}
