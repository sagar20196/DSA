package sortingCodes;

import java.util.Arrays;

//Sort an array of 0s, 1s and 2s in such a way that 0 comes first, 1 comes second and 2 comes third in array.
//This problem is also called Dutch National Flag Problem.

public class Sort012 extends BubbleSort{
	
	public void threeNumberSort(int[] arr)
	{
		int i = 0, j =0, k = arr.length-1;
		while(i<=k)
		{
			if(arr[i]==0)
			{
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i]==1)
			{
				i++;
			}
			else if(arr[i]==2)
			{
				swap(arr,i,k);
				k--;
			}
		}
	}
	
	public void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort012 s = new Sort012();
		int [] arr = {2,0,2,2,0,1,1};
		System.out.println("Given unsorted array of 0s, 1s and 2s:\n"+Arrays.toString(arr));
		System.out.println("Sorted Array of 0s, 1s and 2s:");
		s.threeNumberSort(arr);
		s.printArray(arr);

	}

}
