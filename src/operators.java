
public class operators {

	public static void main(String[] args) {
		
		System.out.println("------Relational operators------");
		int v1=20,v2=30;
		System.out.println(v1<v2);
		System.out.println(v1==v2);
		System.out.println(v1<=v2);
		System.out.println(v1>=v2);
		System.out.println(v1!=v2);
	
		System.out.println("-------logical operators------");
		String un="xyz";
		String pswd="456";
		System.out.println(un=="xyz"&& pswd=="456");
		System.out.println(!(un=="xyz"));
		System.out.println(un=="poq"&& pswd=="456");
		
		
		System.out.println("-------unary operators-------");
		int  v3=8;
		System.out.println(v3++);
		System.out.println(v3);
		System.out.println(--v3);
		
		System.out.println("------ternary operators-------");
		String (ans)=v1>v2"v1 is greater:"v2 is greater";

	}

}
