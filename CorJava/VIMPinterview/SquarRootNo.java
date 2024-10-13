package VIMPinterview;

import java.util.Scanner;

public class SquarRootNo {
	public static void main(String args []) 
	{
			int n,s=0,c,r;
			System.out.println("enter any Number..");
			Scanner t=new Scanner(System.in);
			n=t.nextInt();
			c=n;
			
			double m=Math.sqrt(n);
			System.out.println("Squar root of "+n+"is"+m);
	}
			
}
