package array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

	
		int []a=new int[5];
		 int sum=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter numbers:");
		 
		 for(int i=0;i<5;i++)
		 {
	          a[i]=sc.nextInt();
	          sum=sum+a[i];
	          
		}
		 System.out.println("sum of the numbes:"+ sum);
		
		 {
			 
          for (int u:a)
          {
        	  System.out.println(u);
          }
		 }

            sc.close();
	   
	}

}
