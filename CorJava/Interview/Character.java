package Interview;

import java.util.Scanner;

public class Character {
	public static void main(String args []) 
	{
	    System.out.println("Please enter a character!");
	    Scanner r = new Scanner(System.in);
	    String input = r.next();
	    char ch = input.charAt(0);
	    System.out.println(ch);
	}
}