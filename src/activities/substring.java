package activities;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string:");
	String st=sc.nextLine();
	System.out.println("enter a substring check:");
	String subst=sc.nextLine();
	if(st.contains(subst)) {
		System.out.println("the substring is present");
	}
	else {
		System.out.println("the substring not present");
	}



	}

}
