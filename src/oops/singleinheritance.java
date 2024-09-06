package oops;
 class parent{
	 public void parentqualification()
	 {
		System.out.println("b.ed"); 
	 }
 }
 class child extends parent{
	 public void childmthd()
	 
	 
	 {
		System.out.println("b.arch"); 
	 }
 }




public class singleinheritance {

	public static void main(String[] args) {
		child ob=new child();
		ob.childmthd();
		ob.parentqualification();

	}


}
