package sortingCodes;

import java.util.Arrays;

public class SquaresOfSortedArray extends BubbleSort{
	
	public int[] sortedSquares(int[] arr)
	{
		int n = arr.length;
		int[] result = new int[n];
		int i =0, j = n-1;
		for(int k=n-1;k>=0;k--)
		{
			if(Math.abs(arr[i]) > Math.abs(arr[j]))
			{
				result[k] = arr[i] * arr[i];
				i++;
			}
			else
			{
				result[k] = arr[j] * arr[j];
				j--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquaresOfSortedArray ss = new SquaresOfSortedArray();
		int[] arr = {-4,-1,0,3,10};
		System.out.println("Given unsorted array:\n"+Arrays.toString(arr));
		System.out.println("Squares of a given array in sorted order:");
		int[] res = ss.sortedSquares(arr);
		ss.printArray(res);
		
		

	}

}
