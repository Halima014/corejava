package Pattern;

public class NumberPattern {
	public static void main(String args [])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(j);
			}
			System.out.println("\n");
		}
	}
}

class dfe{
	public static void main(String args [])
	{
		int i,j,count=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				count++;
				System.out.println(j);
			}
			System.out.println("\n");
		}
	}
}