package stackCodes;
import java.util.Stack;
public class ValidParantheses {
	
	public boolean isValid(String s)
	{
		Stack<Character> stk = new Stack<>();
		char[] ch = s.toCharArray();
		for(char c: ch)
		{
			if(c=='(' || c=='[' || c=='{')
			{
				stk.push(c);
			}
			else 
			{
				if(stk.isEmpty())
				{
					return false;
				}
				else 
				{
					char top = stk.peek();
					if(c ==')' && top =='(' || c =='}' && top =='{' || c == ']' && top == '[')
					{
						stk.pop();
					}
					else
					{
						return false;
					}
				}
			}
		}
		
		return stk.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParantheses vp = new ValidParantheses();
		String s = "{()}";
		//String s = "{(]";
		System.out.println("Is Given Parantheses Valid? : "+ vp.isValid(s));

	}

}
