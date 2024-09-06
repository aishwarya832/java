package activities;

import java.util.Scanner;

public class countchar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a string");
		String str=s.next();
		int length=str.length();
		System.out.println("the total number of characters is:"+length);

	}

}
