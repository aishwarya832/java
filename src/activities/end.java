package activities;

import java.util.Scanner;

public class end {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("enter a string:");
		String str=s.next();
		if(str.endsWith("the string endswith 'language'")) {
			System.out.println("the string ends with 'language'");
		}
		else {
			System.out.println("the string does not end with'language'");
		}
		
		
		

	}

}
