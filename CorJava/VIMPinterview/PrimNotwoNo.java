package VIMPinterview;

import java.util.Scanner;

public class PrimNotwoNo {
	public static void main(String args [])
	{
		
		int n1,n2,i,j;
		System.out.println("enter Two Number..");
		Scanner t=new Scanner(System.in);
		n1=t.nextInt();
		n2=t.nextInt();
		
		
		for( i=n1;i<=n2;i++)
		{
			for( j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
			System.out.println(j);
		}
		}
}