package stringCodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Given a string s, return the index of first non-repeating character in it. If it does not exist, return -1. 
   The string will only contain lower case letters.
   Example - 
   Input - str1 = "codeforcode" Output - 4 |  str2 = "aabb" Output - -1
   Explanation - In str1, first non-repeating character is 'f' and is found at index 4 and In str2, It doesn't have
   any non-repeating character.
 */

public class FirstNonRepeatingCharacter {
	
	//find first non repeating character in a given string
	public int firstNonRepeatingCharacter(String str)
	{
		Map<Character, Integer> map = new HashMap();
		char[] chars = str.toCharArray();
		for(char ch: chars)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1); 
			// in getOrDefault function by default the count value is 0, but when value occur we added 1 to it.
		}
		
		for(int i = 0; i < chars.length; i++)
		{
			char ch = chars[i];
			if(map.get(ch)==1) //here we compare the occurence of a character whose count is equals to 1
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNonRepeatingCharacter fc = new FirstNonRepeatingCharacter();
		String str = "racecars";
		int index = fc.firstNonRepeatingCharacter(str);
		System.out.println("Return Index where First Non-Repeating character present in a given string:\n"+index);
		

	}

}
