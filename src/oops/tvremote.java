package oops;
interface remotetv{
	public void volume();
	
}
interface smarttv extends remotetv{
	public void off();
	
}
class tv implements smarttv{

	@Override
	public void volume() {
		System.out.println("VOLUME");
		
	}

	@Override
	public void off() {
		System.out.println("off");
		
	}
	
}
public class tvremote {

	public static void main(String[] args) {
		tv t=new tv();
		t.volume();
		t.off();
				
	}

}
