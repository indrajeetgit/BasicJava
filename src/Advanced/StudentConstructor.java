package Advanced;



public class StudentConstructor {

	int rollno;
	String name;
	
	public StudentConstructor(int rollno, String name) {
	
	// TODO Auto-generated constructor stub
		
		this.rollno=rollno;
		this.name=name;
		
		System.out.println("Employee Details " +rollno+ "   " +name);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentConstructor S=new StudentConstructor(101,"ABC");
	}

}
