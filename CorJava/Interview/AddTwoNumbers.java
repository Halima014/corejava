package Interview;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String args []) 
	{
		int a,b,sum;
		System.out.println("Enter Two Number...!");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		
		sum=a+b;
		
			System.out.println("Addtion "+ sum);
	}
}