package OOPS;

 class Table
 {
	 public synchronized void printTable(int n)
	 {
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println(n*i);
		 }
	 }
 }
 class example1 extends Thread
 {
	 Table t;
	 example1(Table t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printTable(5);
	 }
 }
 class example2 extends Thread
 {

	 Table t;
	 example2(Table t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printTable(7);
	 }
 }
 public class SynchronizedMethod
 {
	 public static void main(String args [])
	 {
		 Table obj=new Table();
		 
		 example1 t1=new example1(obj);
		 example2 t2=new example2(obj);
		 
		 t1.start(); t2.start();
	  }
}