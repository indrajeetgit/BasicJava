import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No,of Rows");
		int row=sc.nextInt();
		System.out.println("Enter No. of Columns");
		int col=sc.nextInt();
		//Declare 2D array
		int arr2D[][]=new int[row][col];
		System.out.println("Enter Elements");
		for(int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				arr2D[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("The elements of Array are");
		for (int i=0;i<row;i++)
		{
			for(int j=0; j<col;j++)
			{
			//	System.out.print(arr2D[i][j]+ "");
				//Tanspose
				System.out.print(arr2D[j][i]+ "");

			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
