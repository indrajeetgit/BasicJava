import java.util.Scanner;

public class Array2_2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int size=sc.nextInt();
		
		//declare an array
		int arr[]=new int[size];
		//taking elements for an array from user
		System.out.println("Enter Elements for an array");
		for(int i=0;i<size; i++)
			
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is Displayed");
		//Display the array
		
		for(int i=0; i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		//print array using enhanced for loop
		System.out.println("Array is Displayed using enhanced loop");
		for(int a:arr)
		{
			System.out.println(a);
		}
		sc.close();
	}

}
