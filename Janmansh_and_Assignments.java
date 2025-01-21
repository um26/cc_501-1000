// Janmansh has to submit 
// 3
// 3 assignments for Chingari before 
// 10
// 10 pm and he starts to do the assignments at 
// X
// X pm. Each assignment takes him 
// 1
// 1 hour to complete. Can you tell whether he'll be able to complete all assignments on time or not?

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in);
	    int t= s.nextInt();
	    for(int i=0;i<t;i++){
	        int x=s.nextInt();
	        if(x+3<=10) System.out.println("Yes");
	        else System.out.println("No");
	    }
	}
}
