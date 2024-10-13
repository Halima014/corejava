package Interview;

import java.util.Scanner;

public class CountDigit {
	public static void main(String args []) 
	{
		int n,Count=0;
		System.out.println("Enter any Number...!");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		while(n>0)
		{
			n=n/10;
			Count++;
		}
		System.out.println("No. of Digits" +Count);
	}
}
