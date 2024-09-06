package activities;

import java.util.Scanner;

public class charvowel {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter characters");
	char ch=sc.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("character is vowel"+ch);
		
	}
	else {
		System.out.println("character is consonant "+ch);
	}
	}

}
