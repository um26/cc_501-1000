// For each bill you pay using CRED, you earn 
// X
// X CRED coins.
// At CodeChef store, each bag is worth 
// 100
// 100 CRED coins.

// Chef pays 
// Y
// Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    for(int i=0;i<t;i++){
	        int x=s.nextInt();
	        int y=s.nextInt();
	        System.out.println(x*y/100);
	    }
	}
}
