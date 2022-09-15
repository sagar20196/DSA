package hashingCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Find sum of two elements in given array which is equal to given target and return index of those two elements

public class TwoSumProblem extends HashTable{
	
	public TwoSumProblem(int capacity)
	{
		super(capacity);
	}
	
	//two sum problem using HashMap
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int[] twoSum1(int [] arr, int target)
	{
		int[] result = new int[2];
		Map map = new HashMap();
		for (int i = 0; i < arr.length; i++) 
		{
			if(!map.containsKey(target - arr[i]))
			{
				map.put(arr[i], i);
			}
			else
			{
				result[1] = i;
				result[0] = (int) map.get(target - arr[i]);
				return result;
			}
		}
		return result;
	}
	
	//two sum problem using sorting and two pointer technique
	public int[] twoSum2(int[] arr, int target)
	{
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int[] result = new int[2];
		while(left<right)
		{
			int sum = arr[left] + arr[right];
			if(sum==target)
			{
				result[0] = arr[left];
				result[1] = arr[right];
				return result;
			}
			else if(sum<target)
			{
				left++;
			}
			else
			{
				right--;
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumProblem ts = new TwoSumProblem(6);
		int [] arr = {2,11,5,10,7,8};
		int[] result1 = ts.twoSum1(arr, 9);
		int[] result2 = ts.twoSum2(arr, 15);
		System.out.println("Return index of two elements whose sum is equal to given target:\n"+Arrays.toString(result1));
		System.out.println("Return numbers whose sum is equal to given target using sorting and two pointer:\n"+Arrays.toString(result2));
		
	}

}
