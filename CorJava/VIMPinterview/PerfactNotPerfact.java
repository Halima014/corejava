package VIMPinterview;
import java.util.Scanner;

public class PerfactNotPerfact {
	
	public static void main(String args []) 
	{
			
			int n,sum=0;
			System.out.println("enter any Number..");
			Scanner t=new Scanner(System.in);
			n=t.nextInt();
			
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;	
				}
			}
			if(n==sum)
				System.out.println("Perfect Number");
			else
				System.out.println("Not Perfect Number");
		}
	}
