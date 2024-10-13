package OOPS;

class task extends Thread 
{
public void run() 
{
	  String name = Thread.currentThread().getName();
	  for (int i = 1; i <= 3; i++) 
	  {
	     System.out.println(name);
	}
   }
}
class JoinMethod 
{
	public static void main(String args[]) 
	{
	        task t1 = new task();
	        task t2 = new task();
	        task t3 = new task();

	        t1.setName("thread 1");
	        t2.setName("thread 2");
	        t3.setName("thread 3");

	        t2.start();
	        try
	        {
	        	t2.join();
	        }	
	        catch(InterruptedException i)
	        {
	        }
	        t1.start();
	        t3.start();
	    }
	}
