package sortingCodes;

/*
 * In Selection sort we divide the given array into two parts - sorted part and unsorted part.
 * The algorithm sorts an array by repeatedly finding the minimum in an unsorted array and making it part of the
   sorted array.
 * From unsorted part, we pick minimum element and swap it with leftmost element of unsorted part. After swap, 
   that element now becomes part of sorted array.
 * It repeats till unsorted array is not empty.
 */

public class SelectionSort extends BubbleSort {
	
	public void sort(int[] arr)
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) 
		{
			int min = i;
			for (int j = i + 1; j < n; j++) 
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ss = new SelectionSort();
		int [] arr = {5,1,10,2,9};
		System.out.println("Given Unsorted Array:");
		ss.printArray(arr);
		ss.sort(arr);
		System.out.println("Sorted Array:");
		ss.printArray(arr);

	}

}
