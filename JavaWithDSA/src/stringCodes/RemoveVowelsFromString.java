package stringCodes;

import java.util.Set;

public class RemoveVowelsFromString {
	
	//Remove vowels from a given string by storing vowels into set and then compare to the string
	public String removeVowels(String str)
	{
		Set<Character> vowels = Set.of('a','e','i','o','u');
		StringBuilder sb = new StringBuilder();
		
		char[] charArray = str.toCharArray();
		for(Character ch : charArray)
		{
			if(!vowels.contains(ch))
			{
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveVowelsFromString rv = new RemoveVowelsFromString();
		String str = "Hey, How are you?";
		String s = rv.removeVowels(str);
		System.out.println("String after removing vowels from a given string:\n"+s);

	}

}
