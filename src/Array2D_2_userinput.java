import java.util.Scanner;

public class Array2D_2_userinput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the row size");
		int row=sc.nextInt();
		System.out.println("enter the column size");
		int col=sc.nextInt();
		
		//Declaring an 2D array
		
		int arr[][]=new int[row][col];
		
		//Enter elements of an array
		
		System.out.println("Enter elements of an array");
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Display of an 2D Array
		System.out.println("2D Array is ");
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+ " ");
				
			}
				System.out.println();
		}
		
		//Transpose
		
		System.out.println("Tanspose of an Array is ");
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
						
				System.out.print(arr[j][i]+ " ");
			}
				System.out.println();
		}
		

		System.out.println("Diagonal of an Array is ");
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
			if(i==j)
			{
				System.out.print(arr[i][j]+ "\t");
			}
				System.out.print("\t");
		}
			
					
				
		System.out.println();
		
	}

	}
}
