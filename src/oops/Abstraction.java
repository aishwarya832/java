package oops;
abstract class car{
	abstract public void speedlimit();
	abstract public void acceleration();
	public void clr() {
		System.out.println("red");
	}
}
class kia extends car{

	@Override
	public void speedlimit() { 
		{
		 System.out.println("kia speedlimit");	
		}
		
	}

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");
		
	}
	
}




	

public class Abstraction {
	
	public static void main(String[] args) {
		car ob=new kia();
		ob.acceleration();
		ob.speedlimit();
		ob.clr();

	}

}

