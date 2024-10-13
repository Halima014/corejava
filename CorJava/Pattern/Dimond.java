package Pattern;

public class Dimond {
	public static void main(String args [])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.println(j);
			}
			for(k=1;k<=(2*i-1);k++)
			{
			System.out.println("*");
		}
			System.out.println("\n");
	}
}
}
