package DecisionMaking;

import java.util.Scanner;

public class SimpleIf {
	
	public static void main(String args []) {
		
		int age;
		System.out.println("Enter your age...!");
		Scanner r=new Scanner(System.in);
		age=r.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible foe votes...!");
		}
		System.out.println("Thank you...!");
	}

}
