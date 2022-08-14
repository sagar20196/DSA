package searchingAlgorithmCodes;

public class LinearSearch {
	
	public int search(int[] arr,int n, int x)
	{
		for(int i=0; i<n; i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch ls = new LinearSearch();
		int[] arr = {5,1,9,2,10,15,20};
		System.out.println("Return index of the element which we want to search in an array:\n"+ls.search(arr, 7, 15));
		
	}

}
