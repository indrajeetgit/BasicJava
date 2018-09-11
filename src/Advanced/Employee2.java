package Advanced;

public class Employee2 {

	int empid;
	int salary;
	String name;
	
	
	void input(int num, int amt, String nm)
	{
	empid=num;
	salary=amt;
	name=nm;
	System.out.println("Employee Details"+num+"  "+amt+"  "+nm);
			
	}
	
	void display(int num, int amt, String nm)
	{
		empid=num;
		salary=amt;
		name=nm;
		System.out.println("Employee Details"+num+"  "+amt+"  "+nm);

	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Employee2 E1=new Employee2();
	Employee2 E2=new Employee2();
	E1.input(101, 22000,"Indra");
	E2.display(102, 33300, "Ravi");
	//Write program to compare salary
	
	}

}
