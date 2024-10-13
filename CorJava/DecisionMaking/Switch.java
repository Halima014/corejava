package DecisionMaking;

import java.util.Scanner;

public class Switch {
	public static void main(String args [])
	{
		int a=10,b=30,ch;
		System.out.println("Enter User choice...!\n");
		Scanner r=new Scanner(System.in);
		ch=r.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Sum" +(a+b));
		break;
		case 2: System.out.println("Sum" +(a-b));
		break;
		case 3: System.out.println("Sum" +(a*b));
		break;
		case 4: System.out.println("Sum" +(a/b));
		break;
		default:System.out.println("Invalid choice...!");
		}
		System.out.println("out of switch...!");
	}

}
