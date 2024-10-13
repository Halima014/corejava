package VIMPinterview;

import java.util.Scanner;

public class TribonacciSeries {
	public static void main(String args []) {
		
		int a=0,b=1,c=2,d,term;
		System.out.println("enter term");
		Scanner t=new Scanner(System.in);
		term=t.nextInt();
		for(int i=1;i<=term;i++)
		{
			System.out.println(a);
			d=a+b+c;
			a=b;
			b=c;
			c=d;
	}
  }
}