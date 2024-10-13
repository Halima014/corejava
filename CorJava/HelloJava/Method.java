package HelloJava;

public class Method {

	public static void Add()
	{
		int a=10, b=20;
		System.out.println("Sum= "+(a+b));
	}
	public static void main(String args [])
	{
		Method t=new Method();
		t.Disp();
		Method.Add();
		Method.Add();
		Method.Add();
	}
	void Disp()
	{
		System.out.println("java\n");
	}
}
