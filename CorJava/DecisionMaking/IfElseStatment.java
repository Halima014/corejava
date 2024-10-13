package DecisionMaking;

import java.util.Scanner;
public class IfElseStatment 
{
public static void main(String args []) {
		
		int n;
		System.out.println("Enter your Number...!");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n>=0)
		{
			System.out.println("+ve Number");
		}
		System.out.println("-ve Number");
	}

}