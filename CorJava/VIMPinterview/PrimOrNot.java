package VIMPinterview;
import java.util.Scanner;

public class PrimOrNot 
{
		public static void main(String args [])
		{
			
			int n,count=0;
			System.out.println("enter any Number..");
			Scanner t=new Scanner(System.in);
			n=t.nextInt();
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
						count++;
				}
			}
			if(count==2)
				System.out.println("prim Number");
			else
				System.out.println("Not prim Number");
		}
	}