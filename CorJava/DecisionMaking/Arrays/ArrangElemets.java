package Arrays;

import java.util.Scanner;

public class ArrangElemets 
{
	public static void main(String args []) 
	{
			int a[]=new int[5]; int temp;
			System.out.println("enter elements in array");
			Scanner t=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				a[i]=t.nextInt();
			}
			for (int i=0;i<5;i++)
			{
				for (int j=0;j<5;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for (int i=0;i<5;i++)
			{
				System.out.println(a[i]+ " ");
			}
	}
}