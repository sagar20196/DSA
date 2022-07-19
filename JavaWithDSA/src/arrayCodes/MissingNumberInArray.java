package arrayCodes;

public class MissingNumberInArray {
	
	//find missing number in an array
	public int missingNumber(int []arr)
	{
		int n = arr.length + 1;
		int sum = n*(n+1)/2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumberInArray mn = new MissingNumberInArray();
		int[] arr = {2,1,4,8,6,3,7};
		int number = mn.missingNumber(arr);
		System.out.println("Missing number is:\n"+number);

	}

}

