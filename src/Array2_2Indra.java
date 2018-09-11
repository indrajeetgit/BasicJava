import java.util.Scanner;

public class Array2_2Indra {

	public static void main(String[] args) 
	{
	
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		sc.close();
		
	}

}
