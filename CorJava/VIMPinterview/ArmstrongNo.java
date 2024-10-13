package VIMPinterview;

import java.util.Scanner;

public class ArmstrongNo 
{
		public static void main(String args []) 
		{
			int n,arm=0,rem,c;
			System.out.println("enter any Number..");
			Scanner t=new Scanner(System.in);
			n=t.nextInt();
			c=n;
			
			while(n>0)
			{
				rem=n%10;
				arm=(rem*rem*rem)+arm;
				n=n/10;
			}
			if(c==arm)
				System.out.println("Armstrong Number");
			else
				System.out.println("Not Armstrong Number");
		}
	}

