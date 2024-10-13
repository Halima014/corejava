package OOPS;

interface custmerRaju
{
	int amt=5;
	public abstract void purchase();
}
class sellerSanju implements custmerRaju
{
	@Override
	public void purchase()
	{
		System.out.println("Raj needs "+amt+" kg rice");
	}
}
public class VariapublicStaFinal
{
	public static void main(String args [])
	{
		custmerRaju c=new sellerSanju();
		c.purchase();
	}
	

}