package oops;
class Pdfdoucment implements document{

	@Override
	public void open() {
		System.out.println("open pdf");
		
	}

	@Override
	public void save() {
		System.out.println("save pdf");
		
	}

	@Override
	public void print() {
		System.out.println("pdf print");
		
	}
	
}
public class pdfdocument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
