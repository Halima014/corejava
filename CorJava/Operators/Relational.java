package Operators;

import java.util.Scanner;

public class Relational {
	
	 public static void main(String args []) 
	 {
	    	int a,b;
	    	Scanner obj=new Scanner(System.in);
	    	System.out.println("Enter two Numbers");
	    	a=obj.nextInt();
	    	b=obj.nextInt();
	    	
	    	
	    	System.out.println("true/false" +(a<b));
	    	System.out.println("true/false" +(a>b));
	    	System.out.println("true/false" +(a<=b));
	    	System.out.println("true/false" +(a>=b));
	    	System.out.println("true/false"  +(a==b));
	    	System.out.println("true/false"  +(a!=b));
	 }

}