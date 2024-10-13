package VIMPinterview;

import java.util.Scanner;

public class EvenNo {

		public static void main (String args []) {
			int n;
			System.out.println("Enter of term ...!");
			Scanner r=new Scanner(System.in);
			n=r.nextInt();
			for(int i=0;i<n;i=i+2)
			{
				System.out.println(i);
			}
		}
	}
