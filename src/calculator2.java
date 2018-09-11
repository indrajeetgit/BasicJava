import java.util.Scanner;

public class calculator2 {

	public static void main(String[] args) 
	
	{
	
do
{

	System.out.println("Calculator");
	System.out.println("Addition +");
	System.out.println("Substraction -");
	System.out.println("Multiplication *");
	System.out.println("Division /");
	System.out.println("%");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	System.out.println("Enter Your Choice");
	char ch=sc.next().charAt(0);
	
	switch (ch)
	{
		case '+':

			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		default:
			System.out.println("Invalid option");
	}
	sc.close();
}
while(false);
		
	}
	}
	
	
	


