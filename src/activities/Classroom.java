package activities;

public class Classroom {
	
	
	int rollnumber;
	String name;
	int mark;
	 public  void  store() {
		 rollnumber=1;
		 name="anu";
		 mark=50;
	 }
	 public void display() {
		 System.out.println("rollnumber:"+rollnumber);
		 System.out.println("name:"+name);
		 System.out.println("mark:"+mark);
	 }

	public static void main(String[] args) {
		 Classroom obj= new Classroom();
		 obj.store();
		 obj.display();

	}

}
