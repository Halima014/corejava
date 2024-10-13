package Pattern;

public class StarPatternLogic {
	public static void main(String args [])
	{
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				if(i==1 || i==3 || j==1 || j==3)
				System.out.println("*");
				else
			        System.out.println(" ");
			}
			System.out.println("\n ");
		}
    }
}