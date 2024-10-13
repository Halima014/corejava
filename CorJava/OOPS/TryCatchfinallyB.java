package OOPS;

public class TryCatchfinallyB {
	    public static void main(String args[]) {
	        try {
	            System.out.println("Coding");
	            int a = 20, b = 0, c;
	            c = a / b;
	            System.out.println(c);
	            System.out.println("like");
	        } catch (ArithmeticException e) {
	            System.out.println("Can't divide by zero");
	        } finally {
	            System.out.println("Subscribe");
	        }
	        System.out.println("main method ended");
	    }
	}
