package Pattern;

public class HalfDimond {
	public static void main(String args [])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(" * ");
			}
			System.out.println();
		}
		
			for(i=1;i<=4;i++)
			{
				for(j=4;j>=i;j--)
			System.out.println("*");
		}
			System.out.println();
	}
}
