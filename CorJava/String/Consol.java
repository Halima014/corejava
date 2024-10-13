package String;

import java.io.Console;

public class Consol {

	public static void main(String args [])
	{
		String str; char ch[];
		Console obj=System.console();
		System.out.println("Enter UserName: ");
		str=obj.readLine();
		System.out.println("Enter password");
		ch=obj.readPassword();
		String a=String.valueOf(ch);
		
		System.out.println("UserName: "+str);
		System.out.println("password: "+ch);
	}
}
