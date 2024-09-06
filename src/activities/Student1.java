package activities;

import activities.student.principle;

interface principle{
	public void resign();
	public void rejoin();
}

public void mark() {
	System.out.println("mark of the student");
}

public void showdetails() {
	System.out.println("student details");
}

class Teacher extends student implements principle{
	public void department() {
		System.out.println("department");
	}

	@Override
	public void resign() {
		System.out.println("resign");
		
	}

	@Override
	public void rejoin() {
	 System.out.println("rejoin");
		
	}
}
public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
