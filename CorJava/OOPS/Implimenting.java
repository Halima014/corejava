package OOPS;

 class imp implements Runnable {
	 public void run() 
	 {
	     for (int i = 1; i<= 5; i++) 
	     {
	        System.out.println("My child Thread");
	     }
	 }
}
class Implimenting
{
	public static void main(String args[]) 
	{
		imp r=new imp();
		Thread t=new Thread();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main Thread");
		}
	}
}