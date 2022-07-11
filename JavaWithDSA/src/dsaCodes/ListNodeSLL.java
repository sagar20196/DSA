package dsaCodes;

public class ListNodeSLL {

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
	
	//Sort Singly Linked List
		public void sortList()
		{
			ListNode current = head;
			ListNode index = null;
			int temp;
			if(head==null)
			{
				return;
			}
			else
			{
				while(current!=null)
				{
					index = current.next;
					while(index!=null)
					{
						if(current.data>index.data)
						{
							temp=current.data;
							current.data = index.data;
							index.data = temp;
						}
						index = index.next;
					}
					current = current.next;
				}
				
			}
		}
}
