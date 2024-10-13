package OOPS;

class Hier 
{
	void input()
	{
		System.out.println("Enter your Name: ");
	}
}
class hii extends Hier
{
	void show()
	{
		System.out.println("My name is ankit");
	}
}
class doll extends Hier
{
	void Disp()
	{
		System.out.println("My name is Ankush");
	}
}
public class HierarchicalInhe
{
	public static void main(String args []) {
		hii r=new hii();
		doll r2=new doll();
		
		r.input(); r.show();
		r.input(); r.show();
	}

}
