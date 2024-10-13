package OOPS;

import java.util.Scanner;

public class NewKey {
	public static void main(String args[])
	{
		int size;
		System.out.println("Enter array size: ");
		Scanner t=new Scanner(System.in);
		size=t.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++)
		{
			a[i]=t.nextInt();
		}
		System.out.println("Array Elements: ");
		for(int m : a)
		{
			System.out.println(m+" ");
		}
	}

}
