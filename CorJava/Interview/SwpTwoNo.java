package Interview;

import java.util.Scanner;

public class SwpTwoNo {
	public static void main(String args []) 
	{
		int a,b,temp;
		System.out.println("Enter two Number...!");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		System.out.println("Before Swapping "+a+" "+b);
		
		temp=a;
		a=b;
		b=temp;
			System.out.println("After Swapping "+a+" "+b);
		}
}
