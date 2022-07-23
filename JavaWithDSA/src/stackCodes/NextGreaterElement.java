/* Given an array of integers. For each element in the array, find its next greater element in that array. The
next greater element is the first element towards right, which is greater than the current element.
Ex : Input: arr = {4,7,3,4,8,1} Output: arr = {7,8,4,8,-1,-1} 
 Here, We iterate for each value in the array 7 is greater than 4 in the above array i.e. towards right from 
4 and then there is 7 and greater than 7 is 8 i.e. towards right from 7. If nothing found then return -1. */

package stackCodes;
import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {
	
	public int[] nextGreaterElement(int[] arr)
	{
		int[] result = new int[arr.length];
		Stack<Integer> stk = new Stack<>();
		for(int i = arr.length-1; i >= 0; i--)
		{
			if(!stk.isEmpty())
			{
				while(!stk.isEmpty() && stk.peek()<=arr[i])
				{
					stk.pop();
				}
			}
			if(stk.isEmpty())
			{
				result[i] = -1;
			}
			else
			{
				result[i] = stk.peek();
			}
			stk.push(arr[i]);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterElement ng = new NextGreaterElement();
		int[] arr = {4,7,3,4,8,1};
		int[] a = ng.nextGreaterElement(arr);
		System.out.println("Next Greater Elements towards right in an array are:\n"+ Arrays.toString(a));
		
	}

}
