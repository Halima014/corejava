package OOPS;

public class TryCatchFinallyBlock {
	public static void main(String args [])
	{
		try
		{
			String a="zohan";
			System.out.println(a.toUpperCase());
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally	
		{
			try
			{
				System.out.println(10/2);
			}
			catch(ArithmeticException a)
			{
				System.out.println(a);
			}
			finally	
			{
				System.out.println("java");
			}
		}
	         System.out.println("main method ended");
     }
	}