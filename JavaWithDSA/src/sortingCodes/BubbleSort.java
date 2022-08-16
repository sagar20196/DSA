package sortingCodes;

import java.util.Arrays;

//Bubble Sort is also called as Sinking Sort. 
//While applying this sorting algorithm on unsorted array, the largest elements tends to sink at the end of array.
//It repeatedly compares pair of adjacent elements and swap them if they are in wrong order.

public class BubbleSort {
	
	public void sort(int[] arr)
	{
		boolean isSwapped;
		for (int i = 0; i < arr.length-1; i++) 
		{
			isSwapped = false;
			for (int j = 0; j < arr.length-1-i; j++) 
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(isSwapped==false)
			{
				break;
			}
		}
	}
	
	public void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs = new BubbleSort();
		int [] arr = {5,1,9,2,10};
		System.out.println("Given Unsorted Array:\n"+Arrays.toString(arr));
		bs.sort(arr);
		System.out.println("Sorted array using Bubble Sort:");
		bs.printArray(arr);

	}

}
