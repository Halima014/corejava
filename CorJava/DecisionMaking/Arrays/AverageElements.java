package Arrays;

import java.util.Scanner;

public class AverageElements {
	public static void main(String args []) 
	{
			int a[]=new int[5]; int sum=0;double avg;
			System.out.println("enter elements in array");
			Scanner t=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				a[i]=t.nextInt();
			}
			System.out.println("Array elements");
			for (int i=0;i<5;i++)
			{
				System.out.println(a[i]+ " ");
			
			}
			for(int i=0; i<5;i++)
			{
				sum=a[i]+sum;
			}
			avg=sum/5;
			System.out.println(sum+ " "+avg);
     }
}
