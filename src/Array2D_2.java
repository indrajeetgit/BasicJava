
public class Array2D_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arr[][]= {{20,30,40},{50,60,70},{80,10,90}};
		
		//arr.length will automatically get the size of the initialized array
		for(int i=0; i<arr.length;i++)
		//or	
		//for (int i=0;i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
