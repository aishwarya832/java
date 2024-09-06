package oops;

import java.util.Scanner;

interface bankappliction{
	void accountdeatils();
	void balance();
	void deposit();
	void withdraw();
}
class details implements bankappliction{
	Scanner s= new Scanner(System.in);

public void accountdeatils() {
	System.out.println("enter account number:");
	String num=s.next();
	System.out.println("enter name of accholder");
	String name=s.next();
	System.out.println("enter branch of holder");
	String nam=s.next();
	
	System.out.println("enter account number"+num);
	System.out.println("enter name of accholder"+name);
	System.out.println("enter branch of holder"+nam);
	
}
@Override
public void balance() {
	System.out.println("enter balance of account:");
	int bal=s.nextInt();
	System.out.println("balance of account"+bal);
}

@Override
public void deposit() {
	System.out.println("enter deposite of account");
	int dep=s.nextInt();
	System.out.println("deposite of account"+dep);
}

@Override
public void withdraw() {
	System.out.println("enter withdrawal amount");
	int with=s.nextInt();
	System.out.println("withdrawal amount"+with);
}

}
public class Bankapplication {

	public static void main(String[] args) { 
		details ob= new details();
		ob.accountdeatils();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		

	}


}

