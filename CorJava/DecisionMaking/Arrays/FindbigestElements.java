package Arrays;

import java.util.Scanner;

public class FindbigestElements 
{
	public static void main(String args []) 
	{
			int a[]=new int[5];int max;
			System.out.println("enter elements in array");
			Scanner t=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				a[i]=t.nextInt();
			}
			max=a[0];
			for (int i=1;i<5;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
				System.out.println("Maximum Elements "+max);
			}
}
