package OOPS;

 class over {
	void draw()
	 {
		 System.out.println("Cant't say shap type");
	 }
 }
class squar extends over
	 {
		 @Override
		 void draw()
		 {
			  System.out.println("squar shape");
		 }
	 }
public class MethodOverriding
{
	public static void main(String args []) {
		over r=new over ();
		r.draw();
	}
}

