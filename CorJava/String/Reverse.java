package String;

public class Reverse
{
	public static void main(String args [])
	{
		int l,i;
		String r="java";
		String r2="";
		l=r.length();
		
		for(i=l-1;i>=0;i--)
		{
			r2=r2+r.charAt(i);
		}
		System.out.println(r2);
		}
}
