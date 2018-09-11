import java.util.Scanner;

public class Firstclass {

	int rollno;
	String name;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No and name");
		int rollno=sc.nextInt();
		String name=sc.next();
		sc.close();
	}
	
	void display()
	{
		System.out.println(rollno);
	}
}
