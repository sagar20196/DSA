package dsaCodes;

public class ListNodeDLL {
	
	protected ListNode head;
	protected ListNode tail;
	protected int length;
	
	public static class ListNode
	{
		protected int data;
		protected ListNode next;
		protected ListNode previous;
		public ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public ListNodeDLL()
	{
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty()
	{
		return length == 0; //if head == null
	}
	
	public int length()
	{
		return length;
	}
	
	public void displayForward()
	{
		if(head==null)
		{
			return;
		}
		ListNode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward()
	{
		if(tail==null)
		{
			return;
		}
		ListNode temp = tail;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp = temp.previous;
		}
		System.out.println("null");
	}

}
