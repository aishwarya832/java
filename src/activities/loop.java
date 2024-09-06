package activities;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String choice;
		do {
			System.out.print("enter first number:");
			int num1=s.nextInt();
			System.out.print("enter second number:");
			int num2=s.nextInt();
			int sum=num1+num2;
			
			System.out.println("sum:"+sum);
			System.out.print("do you want to perform another operation?(yes/no):");
			choice=s.next();
			
		}
		while
			(choice.equalsIgnoreCase("yes"));
		

	}

}
