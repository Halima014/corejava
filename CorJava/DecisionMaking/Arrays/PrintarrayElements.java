package Arrays;

import java.util.Scanner;

public class PrintarrayElements 
{
	public static void main(String args []) 
	{
			int a[]=new int[5];
			System.out.println("enter elements in array");
			Scanner t=new Scanner(System.in);
			for(int i=0;i<a.length;i++)
			{
				a[i]=t.nextInt();
			}
			System.out.println("Array elements");
			for (int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+ " ");
			}
			System.out.println("\n Array revers elements");
			for (int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]+ " ");
			}
	}
}
