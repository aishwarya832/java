package array;

import java.util.Scanner;

public class Multiarray {

	public static void main(String[] args) {
		String[][] ar=  new String[3][2];
		Scanner String= new Scanner(System.in);
		System.out.println("enter the details");
		    	for(int i=0;i<3;i++)
		    	{
		    	   for (int j=0; j<2; j++)
		    	   {
		    		   ar[i][j]=String.next();
		    		   
		    	   }
		    	}
		    		for(int i=0;i<3;i++)
		        	{
		        	   for (int j=0; j<2; j++)
		        	   {
		        		  System.out.print(ar[i][j]+"");
		        	   }

		        	   System.out.println();
		        	   
		        	  

		
	}

}
}
