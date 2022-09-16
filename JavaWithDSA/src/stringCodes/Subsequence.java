package stringCodes;

/*
 * A Subsequence of a string is a new string formed from the original string by deleting some or no characters 
   without changing the order of remaining characters.
   Example --
   "ace" is a subsequence of "abcde"
   "aec" is not a subsequence of "abcde"
 */

public class Subsequence {
	
	public boolean isValidSubsequence(String str, String seq)
	{
		int i =0;
		int j =0;
		while(i<str.length() && j<seq.length())
		{
			if(str.charAt(i)==seq.charAt(j))
			{
				j++;
			}
			i++;
		}
		return j == seq.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsequence ss = new Subsequence();
		String s = "abcde";
		String seq1 = "ace";
		String seq2 = "aec";
		boolean b1 = ss.isValidSubsequence(s, seq1);
		System.out.println("Is "+ seq1 + " a valid subsequence of "+ s + " ?: " + b1);
		boolean b2 = ss.isValidSubsequence(s, seq2);
		System.out.println("Is "+ seq2 + " a valid subsequence of "+ s + " ?: " + b2);
	
	}

}
