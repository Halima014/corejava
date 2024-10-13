package Pattern;

public class Character {
	public static void main(String args [])
	{
		int i,j;
		for(i='A';i<='E';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.println(j);
			}
			System.out.println("\n");
		}
	}
}

class dkf{
	public static void main(String args [])
	{
		int i,j,count='A';
		for(i='A';i<='C';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.println(count);
				count++;
			}
			System.out.println("\n");
		}
	}
}