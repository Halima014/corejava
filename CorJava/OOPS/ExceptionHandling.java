package OOPS;

 public class ExceptionHandling
 {
	 public static void main(String args []) {
		 System.out.println("main method started");
		 
		 int a=10,b=0,c;
		 try {
			 c=a/b;
			 System.out.println(c);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("cant devide by zero");
		 }
		 System.out.println("main method ended");
	 }

}
