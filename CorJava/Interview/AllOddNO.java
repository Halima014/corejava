package Interview;

import java.util.Scanner;

public class AllOddNO {
	public static void main(String args []) 
	{
		int n,sum=0;
		System.out.println("Enter no of Term...!");
		Scanner r=new Scanner(System.in);
         n=r.nextInt();
         
         for(int i=1;i<=n;i=i+2)
         {
		    System.out.println(i+ " ");
	    }
	}
}