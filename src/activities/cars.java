package activities;
class vehicle{
	void drive() {
		System.out.println("driving a vehicle");
	}
	
}
class car extends vehicle{

	@Override
	void drive() {
		System.out.println("repairing a car");
	}
	
}
public class cars {
	public static void main(String[]args) {
				
		
	car ob=new car();
	ob.drive();
	}

}
