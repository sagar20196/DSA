package dsaCodes;

public class ListNodeClass {

	protected ListNode head;
	
	public static class ListNode
	{
		protected int data;        //Can be of generic type
		protected ListNode next;   // Reference to next list node
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void insert(int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next= head;
		head = newNode;
		
	}
	
	//Displaying a linked list
		public void display()
		{
			ListNode current = head;
			while(current!=null)
			{
				System.out.print(current.data+"-->");
				current = current.next;
			}
			System.out.println("null");
		}
}
