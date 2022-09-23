package stackCodes;

/*
 * Given an array of integers arr, there is a sliding window of size k which is moving from the very left of the
   array to the very right. Find maximum sum of any contiguous subarray of size k.
   Example --
   		Input arr = {2,7,3,5,8,1}, k=3
   		Output arr = 16
   		
   		Window position                   Sum
   		[2 7 3] 5 8 1                     12
   		2 [7 3 5] 8 1                     15
   		2 7 [3 5 8] 1                     16
   		2 7 3 [5 8 1]                     14
   		
   	Solution: 
   				1. Take sum of first k elements.
   				2. Subtract the element going out of the sliding window
   				3. Add the new element coming in the sliding window.
 */

public class MaxSumSubarray {
	
	public int maxSubArraySum(int[] arr, int k)
	{
		int maxSum = 0;
		int windowSum = 0;
		int start = 0;
		for (int end = 0; end < arr.length; end++) 
		{
			windowSum = windowSum + arr[end];
			if(end>=k-1)
			{
				maxSum = Math.max(maxSum, windowSum);
				windowSum = windowSum - arr[start];
				start++;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSumSubarray ms = new MaxSumSubarray();
		int[] arr = {2,7,3,5,8,1};
		int k = 3;
		System.out.println("Maximum Sum of SubArray whose size "+k+" is:\n"+ms.maxSubArraySum(arr, k));

	}

}
