import java.util.Scanner;

public class calculator {

public static void main(String[] args) {
		// TODO Auto-generated method stub
do	
{
		System.out.println("+ Addition ");
		System.out.println("- Substraction ");
		System.out.println("* Multiplication ");
		System.out.println("/ Division ");
		System.out.println("% Percentage ");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers \n\n");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("\n\n Enter your choice, +, or -, *, /, or % :");
		char ch=sc.next().charAt(0);
		
		switch (ch)
		{
		
		case '+':
		
			System.out.println(+(num1+num2));
			break;
		case '-':
			
			System.out.println(+(num1-num2));
			break;
			
		case '*':
			
			System.out.println(+(num1*num2));
			break;
		case '/':
			
			System.out.println(+(num1/num2));
			break;
		case '%':
			
			System.out.println(+(num1%num2));
			break;
			
		default :
			
			System.out.println("Invalid Choice");
			
		//sc.close();
	}
}

while(true);

	}
}


