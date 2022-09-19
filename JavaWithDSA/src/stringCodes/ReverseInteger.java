package stringCodes;

public class ReverseInteger {
	
	public long reverse(int number)
	{
		boolean isNegative = number < 0;
		if(isNegative)
		{
			number = number * -1;
		}
		
		long reverse = 0; //Here we took long because when we reverse the value it may be out of range from int data type
		int lastDigit;
		while(number>0)
		{
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number/10;
		}
		
		return isNegative ? reverse * -1 : reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger ri = new ReverseInteger();
		int num = -1234;
		System.out.println("Given Integer:\n"+num);
		long reverse = ri.reverse(num);
		System.out.println("Reverse Integer:\n"+reverse);

	}

}
