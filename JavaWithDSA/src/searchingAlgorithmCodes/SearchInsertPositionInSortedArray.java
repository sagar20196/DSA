package searchingAlgorithmCodes;

public class SearchInsertPositionInSortedArray {
	
	//Search Insert method returns the index at which position target is present if target not available then 
	//it will return the index position where the target value can be inserted in the array.
	public int searchInsert(int[] arr, int target)
	{
		int low = 0;
		int high = arr.length - 1;
		while(low<=high)
		{
			int mid = low + (high - low)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			if(target<arr[mid])
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPositionInSortedArray si = new SearchInsertPositionInSortedArray();
		int [] arr = {1,10,20,47,59,65,75,88,99};
		System.out.println("Return index at which position target is present if target is not available then " +
			"return index where target value can be inserted in the array:\n"+si.searchInsert(arr, 66));

	}

}
