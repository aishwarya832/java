package array;

import java.util.Scanner;

public class Multidimensionalarray {
    public static void main(String[]args) {
    	int[][] c= new int[3][2];
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("enter numbers:");
    	for(int i=0;i<3;i++)
    	{
    	   for (int j=0; j<2; j++)
    	   {
    		   c[i][j]=sc.nextInt();
    		   
    	   }
    	}
    		for(int i=0;i<3;i++)
        	{
        	   for (int j=0; j<2; j++)
        	   {
        		  System.out.print(c[i][j]+"");
        		  
        		   
        	   }
        	   System.out.println();
        	   
        	  

    	}
    		
    	
    }
}
