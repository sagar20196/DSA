package arrayCodes;

import java.util.Scanner;

public class MoveZeroesToEndOfArray extends ArrayImplementation {
		
	//moving zeroes to end of an array
	public void moveZeroes(int[] arr)
	{
		int j = 0;     //focuses on zeroth elements
		for (int i = 0; i < arr.length; i++)   //focuses on non zero elements
		{   
			if(arr[i]!=0 && arr[j]==0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0)
			{
				j++;
			}
		}
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
		MoveZeroesToEndOfArray mz = new MoveZeroesToEndOfArray();
		System.out.println("Moved zeroes to end of the array:");
		mz.moveZeroes(arr);
		mz.printArray(arr);
		sc.close();

	}

}
