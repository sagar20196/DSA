package queueCodes;

public class Queue {
	
	protected ListNode front;
	protected ListNode rear;
	protected int length;
	
	public class ListNode {
		protected int data;
		protected ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public Queue()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void display()
	{
		ListNode current = front;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
}
