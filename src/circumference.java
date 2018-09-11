import java.util.Scanner;

public class circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("\nCalculate the Circumference and Area of a Circle");
		System.out.println("\nEnter the value for Radius ");
		float radius=sc.nextFloat();
		System.out.println("\n The Formula for this is (3.142*radius*radius)");
		
		System.out.println("\n The radius entered by user is " +radius+ "\n \n The Circumference and Area of a Circle : " +(3.142)*(radius*radius));
		sc.close();
		
	}

}
