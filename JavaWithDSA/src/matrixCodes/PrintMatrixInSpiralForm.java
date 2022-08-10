package matrixCodes;

public class PrintMatrixInSpiralForm {
	
	//print matrix in spiral form 
	public void spiralPrint(int[][] matrix, int r , int c)
	{
		int i, k=0, l=0;
		while(k<r && l<c)
		{
			for(i=k;i<c;i++)	//from Left to Right
			{
				System.out.print(matrix[k][i]+" ");
			}
			k++;
			for(i=k;i<r;i++)	//from Top to Bottom
			{
				System.out.print(matrix[i][c-1]+" ");
			}
			c--;
			if(k<r)
			{
				for(i=c-1;i>=l;i--)	//from Right to Left
				{
					System.out.print(matrix[r-1][i]+" ");
				}
				r--;
			}
			if(l<c)
			{
				for(i=r-1;i>=k;i--)	//from Bottom to Top
				{
					System.out.print(matrix[i][l]+" ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMatrixInSpiralForm sf = new PrintMatrixInSpiralForm();
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println("Given matrix in spiral form:");
		sf.spiralPrint(matrix, 4, 4);

	}

}
