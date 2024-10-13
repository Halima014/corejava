package Arrays;

import java.util.Scanner;

public class SmallestElements 
{
		public static void main(String args []) 
		{
				int a[]=new int[5];int min;
				System.out.println("enter elements in array");
				Scanner t=new Scanner(System.in);
				for(int i=0;i<a.length;i++)
				{
					a[i]=t.nextInt();
				}
				min=a[0];
				for (int i=1;i<a.length;i++)
				{
					if(a[i]<min)
					{
						min=a[i];
					}
				}
					System.out.println("Maximum Elements "+min);
				}
	}