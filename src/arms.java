
public class arms {

	

	public static void main(String[] args) {
	 int n=121,r,sum=0,temp=n;
	 while(n>0) 
	 {
      r =n%10;
      sum=sum+r*r*r;
      n=n/10;
	 }
	 if(temp==sum) {
	 
		 System.out.println("armstrong");
		 
	 }
	 else
	 {
		 System.out.println("not an armstrong");
	 }
		 

}
}
