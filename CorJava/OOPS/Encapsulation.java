package OOPS;

class Encap {
	private int value;
	public void setValue(int x)
	 {
		value=x;
	 }
	public int getValue()
	{
		return value;
	}
}
public class Encapsulation
{
	public static void main(String args []) {
		Encap r=new Encap ();
		r.setValue(100);
		System.out.println(r.getValue());
	}
}