package Interview;

import java.util.Scanner;

public class PositiveNagative {
	public static void main(String args [])
	{
		
	        int n;
	      System.out.println("Enter any Number...!");
	       Scanner r=new Scanner(System.in);
	          n=r.nextInt();
	         
	          if(n>0)
	          {
	        	  System.out.println("+ve Number");
	          }
	          else if(n<0)
	          {
	        	  System.out.println("-ve Number");
	          }
	          else
	          {
	        	  System.out.println("Niether +ve nor -ve Number");
	          }
	}
}
