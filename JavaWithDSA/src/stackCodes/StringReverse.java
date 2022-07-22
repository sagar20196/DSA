package stackCodes;

import java.util.Stack;
public class StringReverse {
	
	//reverse a string using stack
	public static String reverse(String str)
	{
		Stack<Character> stk = new Stack<>();
		char[] ch = str.toCharArray();
		
		for(char c : ch)
		{
			stk.push(c);
		}
		for (int i = 0; i < str.length(); i++) 
		{
			ch[i] = stk.pop();
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";
		System.out.println("String before reverse: "+s);
		System.out.println("String after reverse: "+reverse(s));

	}

}
