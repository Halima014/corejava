package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MethodSort {
	public static void main(String args []) 
	{
			int a[]=new int[5];
			System.out.println("enter Data in array");
			Scanner t=new Scanner(System.in);
			for(int i=0;i<a.length;i++)
			{
				a[i]=t.nextInt();
			}
			int a2[]=Arrays.copyOf(a,6);
			a[5]=100;
			System.out.println("Data in Array2");
			for (int i=0;i<a.length;i++)
			{
				System.out.println(a2[i]+ " ");
			}
	}

}
