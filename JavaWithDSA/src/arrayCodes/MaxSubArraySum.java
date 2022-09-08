package arrayCodes;

//Max Sub array sum --> Kadane's Algorithm - Find maximum sub array in given array
public class MaxSubArraySum extends ArrayImplementation{
	
	public int maxSubArraySum(int[] arr)
	{
		int currentMax = arr[0]; //assigning current max element to currentMax
		int maxSoFar = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			currentMax = currentMax + arr[i];
			if(currentMax < arr[i])
			{
				currentMax = arr[i];
			}
			if(maxSoFar < currentMax)
			{
				maxSoFar = currentMax;
			}
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArraySum ms = new MaxSubArraySum();
		int[] arr = {4,3,-2,6,-12,7,-1,6};
		System.out.println("Given Array:");
		ms.printArray(arr);
		System.out.println("Max Sub array sum from the given array using Kadane's Algorithm:\n"+ms.maxSubArraySum(arr));

	}

}
