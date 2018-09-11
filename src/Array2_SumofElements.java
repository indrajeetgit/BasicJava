import java.util.Scanner;

public class Array2_SumofElements {

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter Elements of an Array");
		for(int i=0;i<size; i++)
		{
			arr[i]=sc.nextInt();
						
		}
		//sum of Array logic
		int sum=0;
		
		for(int i=0;i<size; i++)
		{
		 sum=arr[i]+sum;
						
		}
			
			System.out.println("Sum of Elements is:" +sum);

			//Largest Number logic
			int greater=arr[0];
			for(int i=0; i<size; i++)
			{
				if(greater<arr[i])
				{
					greater=arr[i];
					
				}
			}
			System.out.println("The Largest Number is :" +greater);
			
		sc.close();
	}
}
