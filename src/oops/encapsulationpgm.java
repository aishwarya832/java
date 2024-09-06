package oops;
class employeedetails{
	private String empname;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
public class encapsulationpgm {

	public static void main(String[] args) {
	employeedetails ob= new employeedetails();
	ob.setEmpname("anu");
	ob.setEmpid(120);
	System.out.println(ob.getEmpname());
	System.out.println(ob.getEmpid());
	    
	

	}

}
