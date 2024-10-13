package OOPS;

public class NastedCatchBlock {
	public static void main(String args [])
	{
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
	{
		try
		{
			String a="Halima";
			System.out.println(a.toLowerCase());
		}
		catch(NullPointerException n)
		{
			System.out.println("null value can't converted");
	}
	System.out.println("main method ended");
     }
	}
}
