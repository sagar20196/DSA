package stackCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
 * Given an array of integers arr, there is a sliding window of size k which is moving from the very left of the
   array to the very right. We can only see the k numbers in the window. Each time the sliding window moves right 
   by one position. Return the max sliding window.
   
   Example --
   		Input arr = {44,77,33,44,88,11} , k = 3
   		Output arr = {77,77,88,88}
   		
   		Window Position                 Max
   		[44 77 33] 44 88 11             77
   		44 [77 33 44] 88 11             77
   		44 77 [33 44 88] 11             88
   		44 77 33 [44 88 11]             88
 */

public class SlidingWindowMaximum extends NextGreaterElement{

	//Maximum of all subarrays(sliding window whose size k = 3)
	public List<Integer> maxSlidingWindow(int[] arr, int k)
	{
		int[] ngeArr = nextGreaterElement(arr);
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<=arr.length-k; i++)
		{
			int j=i;
			while(ngeArr[j] <i+k)
			{
				j=ngeArr[j];
			}
			result.add(arr[j]);
		}
		return result;
	}
	
	public int[] nextGreaterElement(int[] arr)
	{
		int[] result = new int[arr.length];
		Stack<Integer> stk = new Stack<>();
		for(int i = arr.length-1; i >= 0; i--)
		{
			if(!stk.isEmpty())
			{
				while(!stk.isEmpty() && arr[stk.peek()]<=arr[i])
				{
					stk.pop();
				}
			}
			if(stk.isEmpty())
			{
				result[i] = arr.length;
			}
			else
			{
				result[i] = stk.peek();
			}
			stk.push(i);
		}
		
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlidingWindowMaximum sw = new SlidingWindowMaximum();
		int[] arr = {44,77,33,44,88,11};
		int sizeOfSlidingWindow = 3;
		System.out.println("Given Array of Integers:\n"+Arrays.toString(arr));
		System.out.println("Sliding Window Maximum is:\n"+ sw.maxSlidingWindow(arr, sizeOfSlidingWindow));

	}

}
