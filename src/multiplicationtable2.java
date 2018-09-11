import java.util.Scanner;

public class multiplicationtable2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int range;
		range=sc.nextInt();
		
		
		for(int i=1; i<=range; i++)
		{
			//num=range*i;
			//System.out.println(num);
			System.out.println(range +"*"+ i+"=" +(range*i));
		}
		sc.close();
		}

}
