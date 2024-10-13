package VIMPinterview;
import java.util.Scanner;

public class FactorialNo {
	public static void main (String args []) {
			
			int n;
			System.out.println("Enter any Number... ");
			Scanner t=new Scanner(System.in);
			n=t.nextInt();
			FactorialNo obj=new FactorialNo();
			int result =obj.fact(n);
			System.out.println("Factorial of givn Number: "+result);
	   }
	    int fact(int n)
	    {
	    	if(n==1)
	    		return 1;
	    	else
	    		return n*fact(n-1);
	    }
	}
