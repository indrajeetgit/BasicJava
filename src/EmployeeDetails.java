import java.util.Scanner;

	public class EmployeeDetails {

		public static void main(String[] args) {

			
			Scanner sc=new Scanner(System.in);
			System.out.println("********EMPLOYEE DETAILS**************\n\n");
			System.out.println("\nEnter Employee Name: \n\n");
			String Employee=sc.next();
			System.out.println("\n\nEnter Employee Age:\n\n" );
			Float Age=sc.nextFloat();
			System.out.println("\n\nEnter Employee Salary: \n\n");
			Float Salary=sc.nextFloat();
			
			System.out.println("*******************Employee Details****************\n\n\nEmployee Name is: " +Employee+"\n"+ "Employee Age is: " +Age+"\n"+ "Employee Salary: " +Salary);
			sc.close();
			
		}

	}
