package activities;

import java.util.Scanner;

public class numberrow {

	public static void main(String[] args) {
		int n;
		System.out.println("enter number of row");
		Scanner in= new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
		}
		System.out.println();
	

	}

}