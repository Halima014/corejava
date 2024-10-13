package OOPS;

 class Day {
	 
	int a;  String b;
	Day()
	{
		a=10; b="Coding";
		System.out.println(a+" "+b);
	}
	Day(Day ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+ " "+b);
	}
}
public class CopyConstructor 
{
	public static void main(String args []) {
	     Day r=new Day();
		Day r2=new Day();
	}

}