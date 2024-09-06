package oops;
interface basicanimal{
	void eat();
	void sleep();
}
class monkey{

	public void jump() {
		System.out.println("jump");
	}
	public void bite() {
		System.out.println("bite");
	}
	

}
	

	class human extends monkey implements basicanimal{

		@Override
		public void eat() {
			System.out.println("eat");
			
		}

		@Override
		public void sleep() {
			System.out.println("sleep");
			
		}

		@Override
		public void jump() {
			System.out.println("jump");
			
		}
	

		@Override
		public void bite() {
		System.out.println("bite");
			super.bite();
		}
		
		
	}
public class interface1 {

	public static void main(String[] args) {
		human ob= new human();
			ob.bite();
		ob.eat();
		ob.sleep();
		ob.jump();
				

	}

}
