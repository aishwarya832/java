package oops;
interface car1
{
	void speedlimit();
	void acceleration();
}
interface caraccessaries{
	public void cover();
}

class kia1 implements car1,caraccessaries{

	@Override
	public void speedlimit() {
		System.out.println("speedlimit");
		
		
	}

	@Override
	public void acceleration() {
		System.out.println("acceleration");
		
	}

	@Override
	public void cover() {
		System.out.println("cover details");
		
	}
	
}
class tesla implements car1,caraccessaries{

	@Override
	public void cover() {
		System.out.println("cover details");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("speedlimit");
		
	}

	@Override
	public void acceleration() {
	 System.out.println("acceleration");
		
	}
	
}



public class Interfacepgm {

	
		public static void main(String[] args) {
			kia1 k=new kia1();
			k.acceleration();
			k.speedlimit();
			k.cover();
			
	
			
	}
		

	}


