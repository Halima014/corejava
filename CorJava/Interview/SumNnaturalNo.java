package Interview;

import java.util.Scanner;

public class SumNnaturalNo 
{
	public static void main(String args []) 
	{
		int n,sum=0;
		System.out.println("Enter no of Term...!");
		Scanner r=new Scanner(System.in);
         n=r.nextInt();
         
         for(int i=1;i<=n;i++)
         {
        	 sum=sum+i;
         }
		    System.out.println("Addtion "+ sum);
	    }
	}



