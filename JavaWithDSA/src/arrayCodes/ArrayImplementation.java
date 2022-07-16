package arrayCodes;

public class ArrayImplementation {
	
	//print elements of an array
	public void printArray(int[] arr)
	{
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//add or update elements of an array
	public void addOrUpdateArray()
	{
		int arr[] = new int[5];
		//adding elements in an array
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 1;
		arr[3] = 7;
		arr[4] = 8;
		System.out.println("Given Array elements are:");
		printArray(arr);
		//updating elements of an array
		arr[2] = 10;
		arr[4] = 5;
		System.out.println("Updated Array elements are:");
		printArray(arr);
		
	}

	//remove even integers from an array
	public static int[] removeEvenIntegers(int [] arr)
	{
		int n = arr.length;
		int oddCount = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i]%2!=0)
			{
				oddCount++;
			}
		}
		int result[] = new int[oddCount];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
			{
				result[index] = arr[i];
				index++;
			}
		}
		return result;
	}
	
	//reverse an array
	public void reverseArray(int[]arr, int start, int end)
	{
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayImplementation au = new ArrayImplementation();
		au.addOrUpdateArray();
		System.out.println("Remove even integers from an array:");
		int arr[] = {2,5,1,6,3,8,4,9};
		int result[] = removeEvenIntegers(arr);
		au.printArray(result);
		System.out.println("Reverse elements of an array:");
		int start = 0;
		int end = arr.length - 1;
		au.reverseArray(arr, start, end);
		au.printArray(arr);
		
		
	}

}
