package VIMPinterview;
import java.util.Scanner;

public class Palindrom {
	
	public static void main(String args []) 
	{
			int n,s=0,c,r;
			System.out.println("enter any Number..");
			Scanner t=new Scanner(System.in);
			n=t.nextInt();
			c=n;
			
			while(n>0)
			{
				r=n%10;
				s=(s*10)+r;
				n=n%10;
			}
			if(c==s)
				System.out.println("palindrom Number");
			else
				System.out.println("Not palindrom Number");
		}
	}

