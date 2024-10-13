package VIMPinterview;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args []) {
			
			int term,a=0,b=1,c;
			System.out.println("enter any Number..");
			Scanner t=new Scanner(System.in);
			term=t.nextInt();
			
			for(int i=1;i<=term;i++)
			{
				System.out.println(a+ " ");
				c=a+b;
				a=b;
				b=c;
		}
	  }
	}