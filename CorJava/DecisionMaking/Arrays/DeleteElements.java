package Arrays;

import java.util.Scanner;

public class DeleteElements {
	public static void main(String args []) 
	{
			int size,loc,i;
			System.out.println("enter array size: ");
			Scanner t=new Scanner(System.in);
			size=t.nextInt();
			
			int a[]=new int[size];
			System.out.println("Enter Array Elemets");
			for( i=0;i<size;i++)
			{
				a[i]=t.nextInt();
			}
			System.out.println("Enter Array location: ");
			loc=t.nextInt();
			
			for ( i=loc;i<size-1;i--)
			{
				a[i]=a[i+1];
			}
			size--;
			for(i=0;i<size;i++)
			{
				System.out.println(a[i]+ " ");
			}
}
}
