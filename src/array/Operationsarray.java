package array;

public class Operationsarray {

	public static void main(String[] args) {
		String s=("hello welcome luminar");
		String s1="hello";
		String s2="welcome";
		String s3="Luminar";
		//concat//
		System.out.println(s1.concat(s2));
		System.out.println(4+5+s1+6+7+s2);
		//.equals//
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		//CONTAINS//
		System.out.println(s.contains("luminar"));// true
		//touppercase & tolowercase//
		System.out.println(s.toUpperCase());//HELLO WELCOME LUMINAR
		System.out.println(s.toLowerCase());//hello welcome luminar
		
		//trim//
		System.out.println(s3);//LUMINAR
		System.out.println(s3.trim());//LUMINAR
		//STARTWITH & ENDWITH//
		 System.out.println(s1.startsWith("hello"));
		 System.out.println(s3.endsWith("luminar"));
		 
		//charAt//
		 System.out.println(s1.charAt(2));
		 //length//
		 System.out.println(s2.length());
		 //Substring//
		  System.out.println(s3.substring(2,5));
		  //tocharArray//
		  char[]c=s1.toCharArray();
		    for(char c1:c) 
		    {
		    	System.out.println(c1);
		    	
		    }
		
		
		//split//
		    String[]st=s.split("hello welcome luminar");
		    for (String String1:st);
		    {
		    	System.out.println(s1);
		    	
		    }
          //replace//
		    System.out.println(s.replace("hello","hi"));
	}

}
