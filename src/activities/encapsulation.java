package activities;
class department{
	private String stuname;
	private int admno;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAdmno() {
		return admno;
	}
	public void setAdmno(int admno) {
		this.admno = admno;
	}
	
}

public class encapsulation {

	public static void main(String[] args) {
	department dep= new department();
	dep.setStuname("aishwarya");
	dep.setAdmno(2459);
	System.out.println(dep.getStuname());
	System.out.println(dep.getAdmno());

	}

}
