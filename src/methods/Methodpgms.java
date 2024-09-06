package methods;

public class Methodpgms {

	public static void main(String[] args) {
		
		Methodpgms ob=new Methodpgms();
	     ob.add();
	     int subans=ob.sub();
	     System.out.println(subans);
	     ob.mul(20,30);
	     System.out.println(ob.div(56,5));
	     
		
		
		
	}
   // method without returntype and parameter
		public void add() {
			int a=34,b=45,c;
			c=a+b;
			System.out.println(c);
			
		}
		
//method withreturntype and without parameter
		public int sub() {
			int a=36,b=20,c;
			c=a-b;
			return c;
	}

		//method without returntype and with parameter
		public void mul(int a,int b) {
			int c=a*b;
			System.out.println(c);
		}
		// method with returntype and with parameter
		public double div(double a,double b) {
			double c=a/b;
			return c;
		}
}
