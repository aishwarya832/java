package array;

import java.util.Scanner;

public class charcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextline();
	   int c=0;
	   for(int i=0;i<s.length();i++) {
		   if(!(s.charAt(i)==''))
		   {
			   c++;
		   }
	   }
	System.out.println("the total number of character is"+length);

	}

}
