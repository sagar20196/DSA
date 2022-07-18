package arrayCodes;

import java.util.Scanner;

public class MinMaxInArray {
	
	//finding minimum value in an array
	public int minValue(int [] arr)
	{
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	//find max value in an array
	public int maxValue(int[] arr)
	{
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	//find second max value in an array
	public int findSecondMax(int []arr)
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max)
			{
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		MinMaxInArray m = new MinMaxInArray();
		int min = m.minValue(arr);
		System.out.println("Minimum value in array is:\n"+min);
		System.out.println("Maximum value in array is:\n"+m.maxValue(arr));
		System.out.println("Second Max value in array is:\n"+m.findSecondMax(arr));
		sc.close();

	}

}
