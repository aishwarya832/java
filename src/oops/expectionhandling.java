package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class expectionhandling {

	public static void main(String[] args) throws FileNotFoundException{
	
	FileInputStream ob= new FileInputStream("E://BOOK1.xlsx");
		try {
			int a=23,b=0;
			double c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(" arithmetic expection");
			System.out.println(e.getMessage());
		}
		try {
			int[] ar= new int[4] ;
			ar[0]=15;
			ar[1]=20;
			ar[4]=25;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hello");
		}


	}

}
