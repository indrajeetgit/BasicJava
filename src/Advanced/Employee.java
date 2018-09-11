package Advanced;

public class Employee {
	int empid;
	String name;
	
	void input(int e, String n1)
	{
		empid=e;
		name=n1;
		System.out.println(empid +" "+name);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee S=new Employee();
		S.input(101,"Indra");
		
}
}
