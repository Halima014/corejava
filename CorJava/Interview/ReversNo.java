package Interview;

import java.util.Scanner;

public class ReversNo {
	public static void main(String args []) 
	{
		int n,r;
		System.out.println("Enter two Number...!");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		while(n>0)
		{
			
		r=n%10;
		System.out.println(r);
		n=n%10;
		}
      }
}
