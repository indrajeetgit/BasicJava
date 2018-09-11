
public class Employee 
{

	private int empid;
	private String eName;
	private int age;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
		if (empid>100)
		{
			this.empid=empid;
		}
		else
			System.out.println("Invalid");
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
