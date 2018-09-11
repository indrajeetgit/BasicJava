import java.util.Scanner;

public class countingnumberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count =0;
		
		for(;num!=0; num/=10,++count) 	{}
		
		{
		
			System.out.println(+count);
		}
		
		
		sc.close();
	}

}
