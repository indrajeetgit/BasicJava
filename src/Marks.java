import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************Result***********");
		System.out.println("Enter Marks ");
		int marks=sc.nextInt();
		
		if((marks>0)&&(marks<40))
		{
			
			System.out.println(+marks+ "Fail");
		}
		
		else if ((marks>40)&&(marks<75))
		{
			
				System.out.println("Pass");
		}
		else if ((marks>75)&&(marks<=100))
		
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
		
		sc.close();
}

}
