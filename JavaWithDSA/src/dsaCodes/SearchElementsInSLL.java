package dsaCodes;

public class SearchElementsInSLL {
	
	private ListNode head;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = next;
		}
	}
	public void insert(int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next= head;
		head = newNode;
		
	}
	
	public void displayList()
	{
		ListNode current = head;
		while(current!=null)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	//Searching a particular node in linked list
	public boolean searchElement(int searchKey)
	{
		 ListNode current = head;
			while(current!=null)
			{
				if(current.data==searchKey)
				{
					return true;
				}
				current=current.next;
			}
		return false;
	}
	
	//Find middle node in a linked list
	public ListNode getMiddleNode()
	{
		if(head==null)
		{
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElementsInSLL se = new SearchElementsInSLL();
		se.insert(5);
		se.insert(2);
		se.insert(7);
		se.insert(4);
		System.out.println("Singly Linked List:");
		se.displayList();
		System.out.println("Is the search key found? : "+se.searchElement(5));
		ListNode middleNode = se.getMiddleNode();
		System.out.println("Middle node is :"+middleNode.data);

	}

}
