package stackCodes;

import java.util.EmptyStackException;

public class Stack {
	
	protected ListNode top;
	protected int length;
	
	public class ListNode
	{
		protected int data;
		protected ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public Stack()
	{
		top = null;
		length = 0;
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void push(int data)
	{
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		stk.push(3);
		stk.push(8);
		stk.push(5);
		stk.push(4);
		System.out.println(stk.peek()); //peek is 4
		stk.pop();
		System.out.println(stk.peek()); //peek is 5
		stk.pop();
		System.out.println(stk.peek()); //peek is 8
		stk.pop();
		System.out.println(stk.peek()); //peek is 3

	}

}
