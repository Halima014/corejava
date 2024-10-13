package OOPS;

class msg 
{
 public synchronized void show(String name)
{
	 ;;;;;;
	 
	 for(int i=1;i<=3;i++)
	 {
		 System.out.println("How are U"+name);
	}
	 ;;;;;;
	 }
}
 class OurThread extends Thread
{
	msg m;
	String name;
	OurThread(msg m,String name)
	{
	   this.m=m;
	   this.name=name;
	}
}

public class SyncronizedBlock 
{
 public static void main(String args [])
{
		msg m=new msg();
			 
	   OurThread t1=new OurThread (m,"ankit");
	   OurThread  t2=new OurThread (m,"harsh");
			 
	      t1.start(); t2.start();
		  }
	}

