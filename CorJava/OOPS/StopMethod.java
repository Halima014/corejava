package OOPS;

class f extends Thread 
 {
public void run() 
	{
		String name = Thread.currentThread().getName();
		  for (int i = 1; i <= 3; i++) {
		  System.out.println(name);
		  }
	    }
	}
public class StopMethod
{
public static void main(String args[])
{
	       f t1 = new f();
	       f t2 = new f();
	       f t3 = new f();

	       t1.setName("t1 thread");
	       t2.setName("t2 thread");
	       t3.setName("t3 thread");
	       
		        t1.start();

		        t2.start();
		        
		        t3.start();
		    }
		}
