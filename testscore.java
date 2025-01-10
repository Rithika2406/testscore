import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int n=S.nextInt();
		    int x=S.nextInt();
		    int y=S.nextInt();
		    if(y%x==0)
		    {
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}