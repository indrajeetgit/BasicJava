import java.util.Scanner;

public class AdditionofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No,of Rows");
		int row=sc.nextInt();
		System.out.println("Enter No. of Columns");
		int col=sc.nextInt();
		//Declare 2D array
		int arrA[][]=new int[row][col];
		int arrB[][]=new int[row][col];
		int sum[][] = new int[row][col];
		
		//int arrC[][]=new int[row][col];
		
		System.out.println("Enter Elements");
		for(int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				arrA[i][j]=sc.nextInt();
				
			}
		}
		
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arrB[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Output of rows/column");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arrA[i][j]);
				System.out.println(arrB[i][j]);
				
			}
			System.out.println();
		}
		
		System.out.println("The sum of Array is");
			
			for (int i=0;i<row;i++)
				{
					for(int j=0; j<col;j++)
					{
						sum[i][j]=arrA[i][j]+arrB[i][j];
						System.out.print(sum[i][j]+ "  ");	
			
					}
					
				System.out.println();
		}
		
		sc.close();
	}

}
