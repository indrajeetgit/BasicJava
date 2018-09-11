import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1: Area of the Rectangle");
		System.out.println("2: Area of the Circle");
		System.out.println("3: Area of the Triangle");
		
		System.out.println("Enter your choice");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		
		switch (ch)
		{
		
		case 1:
			System.out.println("Enter the value for L");
			int l=sc.nextInt();
			System.out.println("Enter the value for b");
			int b=sc.nextInt();
			System.out.println("Area of Rectangle :" +(l*b));
			break;
			
		case 2:
			System.out.println("Enter the value for pi and Radius: ");
			float pi=sc.nextFloat();
			float r=sc.nextFloat();
			
			System.out.println("Area of the Circle: " +(pi*r*r));
			break;
		
		case 3:
			System.out.println("Enter the value for base and height");
			float base=sc.nextFloat();
			float height=sc.nextFloat();
			
			System.out.println("Area of the Triangle: " +(0.5*base*height));
			break;
		
		default:
			
			System.out.println("Invalid Choice");
		}
		
		sc.close();
	}

}
