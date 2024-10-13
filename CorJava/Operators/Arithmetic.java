package Operators;

import java.util.Scanner;

public class Arithmetic 
{
	 public static void main(String args []) 
	 {
	    	int a,b;
	    	Scanner obj=new Scanner(System.in);
	    	System.out.println("Enter two Numbers");
	    	a=obj.nextInt();
	    	b=obj.nextInt();
	    	
	    	
	    	System.out.println("Addtion "+(a+b));
	    	System.out.println("Subtraction "+(a-b));
	    	System.out.println("Multiplication"+(a*b));
	    	System.out.println("Division "+(a/b));
	    	System.out.println("Remainder "+(a%b));
	 }

}
