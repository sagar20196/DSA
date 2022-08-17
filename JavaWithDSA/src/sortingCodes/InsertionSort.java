package sortingCodes;

/*Insertion Sort is simple sorting algorithm that works the way we sort playing cards in our hands.
*In insertion sort we divide the given array into two parts - sorted parts and unsorted parts
*From Unsorted part, we take first element and place at its correct position in sorted array. This is done by
 shifting all the elements which are larger than first element by one position.
*/

public class InsertionSort extends BubbleSort{
	
	public void sort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) //unsorted part
		{
			int temp = arr[i];
			int j = i-1; 	//sorted part
			
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];	//shifting larger elements to temp by 1 position
				j = j-1;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort is = new InsertionSort();
		int [] arr = {3,1,5,4,7,2,6};
		System.out.println("Given Unsorted Array:");
		is.printArray(arr);
		is.sort(arr);
		System.out.println("Sorted Array:");
		is.printArray(arr);

	}

}
