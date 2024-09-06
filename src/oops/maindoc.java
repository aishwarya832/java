package oops;

public class maindoc {

	public static void main(String[] args) {
		document pdfdoc= new Pdfdoucment();
		pdfdoc.open();
		pdfdoc.save();
		pdfdoc.print();
		
		document word= new Worddoucment();
		word.open();
		word.save();
		word.print();

	}

}
