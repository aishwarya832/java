package activities;

import java.util.Scanner;

public class wordstring {

	public static void main(String[] args) {
      Scanner sca = new Scanner(System.in); {
		System.out.println("enter a string:");
		String st=sca.nextLine();
		String[] words=st.trim().split(st);
		System.out.println("number of string"+words);
	}

	}
}
