package Interview;

import java.util.Scanner;

public class CalculaterPowerNo {
	public static void main(String args []) 
	{
		int n,p,result=1;
		System.out.println("Enter no ");
		Scanner r=new Scanner(System.in);
         n=r.nextInt();
         System.out.println("Enter power ");
         p=r.nextInt();
         
         for(int i=1;i<=p;i++)
         {
        	 result=n*result;
         }
		    System.out.println("Power" +result);
	    }
	}