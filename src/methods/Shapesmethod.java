package methods;

public class Shapesmethod {

	public static void main(String[] args) {
		Shapesmethod ob=new Shapesmethod();
		ob.circle();
		double square=ob.square();
		System.out.println(square);
		
		System.out.println(ob.rectangle(10,15));
		ob.triangle(10,15);
		
		
		

	}
	public void circle()
	{
		double r=35.6,ar;
		ar=3.14*r*r;
		System.out.println("area of circle"+ar);
				
	}
	 public double square()
	 {
		 double s=5.0;
		 double ar=s*s;
		 return ar;
	 }
	 
	 public double rectangle(double l, double b) {
		double ar=l*b;
		return ar;
	 }
	 
	 public void triangle(double b, double h )
	 {
	
		double=0.5*b*h;
		  System.out.println("area of triangle");
		  
	 }

}
