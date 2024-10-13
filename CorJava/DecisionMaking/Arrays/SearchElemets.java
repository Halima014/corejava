package Arrays;

import java.util.Scanner;

public class SearchElemets {
	public static void main(String args []) 
	{
			int a[]=new int[5]; int n,count=0;
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
			System.out.println("Enter search  Elements");
			n=t.nextInt();
			for(int i=0; i<a.length;i++)
			{
				if(a[i]==n)
				{
					count++;
				}
			}
			if(count>0)
				System.out.println("Iterm Found "+count+"temes");
			else
				System.out.println("Iterm Not Found ");
		}
}