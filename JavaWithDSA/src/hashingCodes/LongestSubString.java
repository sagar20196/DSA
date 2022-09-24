package hashingCodes;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string str, find the length of longest substring without repeating characters.
   Example --
   		Input str = "abcabcbb"
   		Output - 3
   		
   		Input str = "pwwp"
   		Output - 2
   		
   		Input str = "aaaa"
   		Output - 1
 */

public class LongestSubString {
	
	//Length of longest substring without repeating characters
	public int lengthOfLongestSubstring(String s)
	{
		Map<Character, Integer> map = new HashMap<>();
		int maxLength = 0;
		int start = 0;
		for (int end = 0; end < s.length(); end++) 
		{
			char ch = s.charAt(end);
			if(map.containsKey(ch))
			{
				//Here we are taking Math.max because the new substring will starts from the character that repeated 
				//again and return the index of previous occur character then add one into it
				start = Math.max(start, map.get(ch)+ 1);
			}
			map.put(ch,end);
			maxLength = Math.max(maxLength, end - start +1);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubString ls = new LongestSubString();
		String str = "abcabcdabb";
		int length = ls.lengthOfLongestSubstring(str);
		System.out.println("Length of a Longest Substring without repeating character: "+length);

	}

}
