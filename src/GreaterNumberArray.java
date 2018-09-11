import java.util.Scanner;

public class GreaterNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Array elements are");
		for(int a:arr)
		{
			System.out.println(a);
			
	}
//used below enhanced loop
		
//		int greater=arr[0];
//		for(int a:arr)
//			
//		{
//			if (greater<a)
//			{
//				greater=a;
//			}
//		}
//		System.out.println("Greater number is " +greater);
//		REgular Loop below
		
		int greater=arr[0];
		for(int i=0; i<size; i++)
		{
			if(greater<arr[i])
			{
				greater=arr[i];
				
				
			}
			
						
		}
		System.out.println("Greater: " +greater);
		
	sc.close();
	}

}

