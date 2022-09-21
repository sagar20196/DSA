package arrayCodes;

import java.util.Arrays;

/*
 * Given an array of integers arr[], return an array result[] such that result[i] is equal to the product of all 
   the elements of arr except arr[i](current position). The product fits in 32-bit integer. The algorithm should 
   run in O(n) time and without using division operator.
   Example --
   		Input arr = {1,2,3,4}
   		Output result = {24,12,8,6}
   		
   		Input arr = {-1,1,0,-3,3}
   		Output result = {0,0,9,0,0} 
 */

public class ProductOfAnArray {
	
	//Product of an array except self(the pointer i current position should not be multiplied with rest elements)
	public int[] findProduct(int[] arr)
	{
		int temp = 1;
		int[] result = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			result[i] = temp;
			temp = temp * arr[i];
		}
		
		temp = 1;
		for (int i = arr.length - 1; i >= 0; i--) 
		{
			result[i] = result[i] * temp;
			temp = temp * arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfAnArray pa = new ProductOfAnArray();
		int[] arr = {2,3,4,5};
		int[] result = pa.findProduct(arr);
		System.out.println("Product of an array except self:\n"+Arrays.toString(result));

	}

}
