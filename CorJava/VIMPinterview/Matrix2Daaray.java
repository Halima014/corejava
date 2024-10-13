package VIMPinterview;

import java.util.Scanner;

public class Matrix2Daaray {
public static void main(String args []) {
		
		int a[][]=new int[2][2]	;
	    System.out.println("enter Array Elemetns");
		Scanner t=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=t.nextInt();
			}
		}
		  System.out.println("Matrix: \n");
		  for(int i=0;i<2;i++)
		  {
			  for(int j=0;j<2;j++)
			  System.out.println(a[i][j]+ " ") ;
		  }
		  System.out.println("\n") ;
    }
}
