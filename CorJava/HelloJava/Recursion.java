package HelloJava;

public class Recursion {
	public static void main(String args [])
	{
		Recursion r=new Recursion();
		int a=r.sum(3);
		System.out.println("Sum first N natural Number:"+a);
	}
	int sum(int b)
	{
		if(b>0)
		{
			return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}

}
