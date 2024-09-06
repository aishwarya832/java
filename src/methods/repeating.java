package methods;

import java.util.Scanner;

public class repeating {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[]c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			count=1;
			for(int j=i+1;j<c.length;i++) {
				if(c[i]==c[j]){
				count++	;
				c[j]='0';
				}
			}
		
		if (count >1&& c[i]!='0')
		{
			System.out.println("repeating  characters="+c[i]);
			System.out.println("count="+count);
		}
		

	}

}
}
