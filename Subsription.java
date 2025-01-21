// A new TV streaming service was recently started in Chefland called the Chef-TV.

// A group of 
// N
// N friends in Chefland want to buy Chef-TV subscriptions. We know that 
// 6
// 6 people can share one Chef-TV subscription. Also, the cost of one Chef-TV subscription is 
// X
// X rupees. Determine the minimum total cost that the group of 
// N
// N friends will incur so that everyone in the group is able to use Chef-TV.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in);
	    int t=s.nextInt();
	    for(int i=0;i<t;i++){
	        int n=s.nextInt();
	        int x=s.nextInt();
	        if(n%6==0) System.out.println(x*n/6);
	        else System.out.println(x*((n/6)+1));
	    }
	}
}
