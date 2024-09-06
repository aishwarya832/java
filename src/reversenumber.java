
public class reversenumber {

	public static void main(String[] args) {
		int number= 654321,reverse=0;
		while(number!=0)
		{
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
			
		}
		System.out.println("The reverse of the gib=ven number is:"+reverse);
		

	}

}