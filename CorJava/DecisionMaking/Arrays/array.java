package Arrays;

import java.util.Scanner;

public class array 
{
	public static void main(String args [])
	{
		int a[]=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}

class kee{
	public static void main(String args []) 
	{
		int size, i;
		System.out.println("enter size of array..");
		Scanner t=new Scanner(System.in);
		size=t.nextInt();
		int a[]=new int [size];
		
		for( i=0;i<size;i++)
		{
			a[i]=t.nextInt();
		}
			System.out.println("printed Array Elemnts");
			for( i=0;i<size;i++)
			{
				System.out.println(a[i]+" ");
			}
			}
		}

