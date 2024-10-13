package OOPS;

 class This 
 {
		int a;
		This(int a)
		{
			this.a=a;
		}
			void show()
			{
				System.out.println(a);
			}
	}
		
class ThisKey
	{
		public static void main(String args [])
		{
			This r=new This(100);
			r.show();
		}
}