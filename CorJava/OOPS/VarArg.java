package OOPS;

 class Var
 {
	 void add(int...a)
	 {
		 int sum=0;
		 for(int x:a)
		 {
			 sum=sum+x;
		 }
		 System.out.println("sum of Number: "+sum);
	 }
 }
 class VarArg
 {
	 public static void main(String args []) {
		 Var r=new Var() ;
		 r.add(); r.add(10); r.add(10,20);
		 r.add(10,20,30);    r.add(10,20,30);
	 }
}