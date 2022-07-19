package arrayCodes;

public class StringPalindrome {
	
	//find whether string is Palindrome or not.
	public boolean isPalindrome(String word)
	{
		char[] ch = word.toCharArray();
		int start = 0;
		int end = word.length()-1;
		while(start<end)
		{
			if(ch[start]!=ch[end])
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	//find whether given number is palindrome or not.
	public boolean isPalindrome(int num)
	{
		int temp, rev = 0, m;
		temp = num;
		while(num>0)
		{
			m = num % 10;
			rev = rev * 10 + m;
			num = num / 10;
		}
		if(temp==rev)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "madam";
		StringPalindrome sp = new StringPalindrome();
		System.out.println("Is the given string Palindrome? : "+sp.isPalindrome(word));
		int number = 12321;
		System.out.println("Is the given number Palindrome? : "+sp.isPalindrome(number));

	}

}
