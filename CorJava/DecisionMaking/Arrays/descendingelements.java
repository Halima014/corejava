package Arrays;

import java.util.Scanner;

public class descendingelements 
{
	public static void main(String args []) 
	{
			int a[]=new int[5]; int temp;
			System.out.println("enter value  in array");
			Scanner t=new Scanner(System.in);
			for(int i=0;i<a.length;i++)
			{
				a[i]=t.nextInt();
			}
			for (int i=0;i<a.length;i++)
			{
				for (int j=i+1;j<a.length;j++)
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