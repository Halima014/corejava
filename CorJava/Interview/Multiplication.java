package Interview;

import java.util.Scanner;

public class Multiplication {
	public static void main(String args []) 
	{
		int num;
		System.out.println("Enter any Number...!");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num=num*i);
		}
	}

}