package methods;

public class constructor {
String course;
int slno;
   public constructor(String course,int slno) {
	   this.course=course;
	   this.slno=slno;
   }
   
   public void display()
   {
	   System.out.println(course);
	   System.out.println(slno);
   }
	public static void main(String[] args) {
	constructor ob=new constructor("ba",5);
       ob.display();
	}

}
