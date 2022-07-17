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
		sc.close();

	}

}
