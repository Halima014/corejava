package Arrays;

import java.util.Scanner;

public class InsertElemets {
	public static void main(String args []) 
	{
			int size,loc,term,i;
			System.out.println("enter array size: ");
			Scanner t=new Scanner(System.in);
			size=t.nextInt();
			
			int a[]=new int[size+1];
			System.out.println("Enter Array Elemets");
			for( i=0;i<size;i++)
			{
				a[i]=t.nextInt();
			}
			System.out.println("Enter Array location: ");
			loc=t.nextInt();
			System.out.println("Enter new item: ");
			term=t.nextInt();

			for ( i=size;i>loc;i--)
			{
				a[i]=a[i-1];
			}
			a[loc]=term;
			size++;
			for(i=0;i<size;i++)
			{
				System.out.println(a[i]+ " ");
			}
}
}
