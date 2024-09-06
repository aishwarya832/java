package oops;
class Shape
{
   public void area()	{
	   System.out.println("area of Shape");
	   
   }
}
class circle extends Shape{
	
   public void Circle() {
	   System.out.println("area of circle"+3.14*2*2);
   }
}
class Rectangle extends Shape{

	@Override
	public void area() {
	System.out.println("area of Rectangle"+6*2);
		super.area();
	}

	}
	

public class OVERRIDING {

	public static void main(String[] args) {
       circle c=new circle();
       c.area();
       Rectangle r=new Rectangle();
       r.area();

	}

}
