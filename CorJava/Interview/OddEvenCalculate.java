package Interview;

import java.util.Scanner;

public class OddEvenCalculate {
	public static void main(String args []) 
	{
		int n,i,sum=0;
		System.out.println("Enter Range...!");
		Scanner r=new Scanner(System.in);
         n=r.nextInt();
         
         if(n%2==0)
         {
         for( i=0;i<=n;i=i+2)
         {
        	 sum=sum+i;
	    }
         System.out.println("sum of Even Number");
	    }
         else
         {
        	 for(i=1;i<=n;i=i+2)
        	 {
        		 sum=sum+i;
        	 }
        	 System.out.println("sum of Odd Number");
        	 }
      }
}