package searchingAlgorithmCodes;

public class BinarySearch {
	
	//search an element in sorted array using binary search
	public int search(int[] arr, int key)
	{
		//here we found the key when low,mid and high meets at the same point
		int low = 0;
		int high = arr.length -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid]==key)
			{
				return mid; 
			}
			if(arr[mid]>key)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int[] arr = {1,10,20,47,59,65,75,88,99};
		System.out.println("Return index of the key which we search in given array:\n"+bs.search(arr, 88));

	}

}
