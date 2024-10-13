package OOPS;

class four {
	int a,b,c;  
	void add()
	{
		a=10; b=20; 
		c=a+b;
		System.out.println("sum of two Numbers:" +c);
	}
	void sub()
	{
		a=200; b=100;
		c=a-b;
		System.out.println("sub of two Numbers:"+c);
	}
}
class five extends four
{
	void multi()
	{
		a=10; b=20; 
		c=a*b;
		System.out.println("Multiplication of two Numbers:" +c);
	}
	void div()
	{
		a=200; b=100;
		c=a/b;
		System.out.println("division of two Numbers:"+c);
	}
		
}
	
public class MultilevelInhe  
{
	public static void main(String args []) {
	     four r=new four();
		r.add(); r.sub();
	}
}
