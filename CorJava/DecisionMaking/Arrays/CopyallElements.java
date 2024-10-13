package Arrays;

import java.util.Scanner;

public class CopyallElements 
{
	public static void main(String args []) 
	{
			int a[]=new int[5];
			int b[]=new int[5];
			System.out.println("enter value in first array");
			Scanner t=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				a[i]=t.nextInt();
			}
			System.out.println(" First Array elements");
			for (int i=0;i<5;i++)
			{
				System.out.println(a[i]+ " ");
			}
			System.out.println("\nsecond Array elements");
			for (int i=0;i<5;i++)	
			{
				b[i]=a[i];
				System.out.println(b[i]+ " ");
			}
         }
}
