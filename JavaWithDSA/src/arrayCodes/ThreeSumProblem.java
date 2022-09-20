package arrayCodes;

import java.util.Arrays;

/*
 * Given an array of distinct integers, print all such triplets such that they add up to a specific target. The
   triplet should be ordered in ascending order.
   Example -- 
   		Given array of integers - {2,4,3,7,1,8,9,0}, target= 6
   Solution --
   		Print - {0,2,4}, {1,2,3} --- Triplets
   				   |		|
   		sum   =    6        6
 */

public class ThreeSumProblem {
	
	public void threeSum(int[] arr, int target)
	{
		Arrays.sort(arr);
		//Here we are taking length as arr.length - 2 because we have to give space for two other pointers j and k 
		for (int i = 0; i < arr.length-2; i++)  
		{
			int j = i+1;
			int k = arr.length-1;
			while(j<k)
			{
				int sum = arr[i] + arr[j] + arr[k];
				if(sum==target)
				{
					System.out.println("{"+ arr[i] + "," + arr[j] + "," + arr[k] + "}");
					j++;
					k--;
				}
				else if(sum<target)
				{
					j++;
				}
				else
				{
					k--;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumProblem ts = new ThreeSumProblem();
		int[] arr = {2,4,3,7,1,8,9,0};
		int target = 6;
		System.out.println("Triplets from given array whose sum is equal to the given target:");
		ts.threeSum(arr, target);

	}

}
