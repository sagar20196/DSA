package matrixCodes;

//Here the matrix is column wise sorted matrix and search in a row
public class SearchKeyInMatrix {
	
	//search key in matrix where n specify matrix size n x n and x is a key to search 
	public void search(int[][] matrix, int n, int x)
	{
		int i = 0;
		int j = n-1;
		while(i<n && j>=0)
		{
			if(matrix[i][j]==x)
			{
				System.out.println("The key "+x+" is found at - "+i+","+j+" position in a given matrix." );
				return;
			}
			if(matrix[i][j]>x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchKeyInMatrix sk = new SearchKeyInMatrix();
		int[][] matrix = {
							{10,20,30,40},
							{15,25,35,45},
							{27,29,37,48},
							{32,33,39,51}
						 };
		sk.search(matrix, 4, 32);

	}

}
