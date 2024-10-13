package OOPS;

class hey extends Thread
	{
	public void run() 
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
	           System.out.println("t1 thread running");
	           Thread.sleep(1000);
			}
		}
	catch(InterruptedException i)
		{
		    System.out.println("t1 thread terminated...!");
		}
	}	
}
public class IntrreptMethod
{
	public static void main(String args[]) 
	{
	      hey t1 = new hey();
	     
	        t1.start();
	
	        t1.interrupt();
	}
}
