package sortingCodes;

public class MergeSort extends BubbleSort{
	
	//merge two sorted array
	public int[] merge(int[] arr1, int[] arr2, int n, int m)
	{
		int[] result = new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m)
		{
			if(arr1[i]<arr2[j])
			{
				result[k] = arr1[i];
				i++;
			}
			else
			{
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<n)
		{
			result[k] = arr1[i];
			i++; k++;
		}
		
		while(j<m)
		{
			result[k] = arr2[j];
			j++; k++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort ms = new MergeSort();
		int[] arr1 = {2,3,7,9};
		int[] arr2 = {4,5,8,10};
		System.out.println("Given Sorted Array 1:");
		ms.printArray(arr1);
		System.out.println("Given Sorted Array 2");
		ms.printArray(arr2);
		System.out.println("Merged Array from given two sorted array:");
		int[] result = ms.merge(arr1, arr2, arr1.length, arr2.length);
		ms.printArray(result);

	}

}
