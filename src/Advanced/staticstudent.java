package Advanced;

public class staticstudent {
	
	int rollno;
	String name;
	static String collegename="Symb";
	
	void Student(int rollno, String name, String collegename)
	{
		this.rollno=rollno;
		this.name=name;
		staticstudent.collegename=collegename;
		System.out.println(rollno+name+ "" +collegename);
		
	}
	void display()
	{
		System.out.println(rollno+name+ "" +collegename);
	}
	
	static void change()
	{
		collegename="Govt";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticstudent S=new staticstudent();
		S.Student(102,"ABD","Surya");
		S.display();
		S.change();
	}

}
