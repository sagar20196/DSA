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

	}

}
