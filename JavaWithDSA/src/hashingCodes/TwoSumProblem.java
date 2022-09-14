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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int[] twoSum(int [] arr, int target)
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumProblem ts = new TwoSumProblem(6);
		int [] arr = {2,11,5,10,7,8};
		int[] result = ts.twoSum(arr, 9);
		System.out.println("Return index of two elements whose sum is equal to given target:\n"+Arrays.toString(result));

	}

}
