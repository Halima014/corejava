package HelloJava;

class StaticvsNonstatic
{
	int a=10;
	static int b=20;

	public static void main(String args [])
	{
		StaticvsNonstatic t=new StaticvsNonstatic();
		t.Disp();
		StaticvsNonstatic.Show();
	}
	static void Show()
	{
		System.out.println("Show() "+b);
	}
	void Disp()
	{
		System.out.println("Disp() "+a+" "+b);
	}

}
