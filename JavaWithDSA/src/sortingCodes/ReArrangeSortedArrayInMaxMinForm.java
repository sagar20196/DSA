package sortingCodes;

import java.util.Arrays;

public class ReArrangeSortedArrayInMaxMinForm extends BubbleSort {
	
	//Rearrange Sorted Array in Max/Min Form like at even index max value and at odd index min value
	public void arrangeMaxMin(int[] arr)
	{
		int maxIndex = arr.length - 1;
		int minIndex = 0;
		int max = arr[maxIndex] + 1;
		for(int i =0; i<arr.length;i++)
		{
			if(i%2==0)
			{
				arr[i] = arr[i] + (arr[maxIndex]%max) * max;
				maxIndex--;
			}
			else
			{
				arr[i] = arr[i] + (arr[minIndex]%max) * max;
				minIndex++;
			}
		}
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = arr[i]/max;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReArrangeSortedArrayInMaxMinForm mm = new ReArrangeSortedArrayInMaxMinForm();
		int [] arr = {2,3,5,6,8,9};
		System.out.println("Given Sorted Array:\n"+Arrays.toString(arr));
		System.out.println("Given Sorted Array in Max/Min Form");
		mm.arrangeMaxMin(arr);
		mm.printArray(arr);

	}

}
