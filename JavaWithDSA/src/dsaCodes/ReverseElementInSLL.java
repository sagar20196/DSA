package dsaCodes;

public class ReverseElementInSLL extends ListNodeClass{
	
	public void displayList(ListNode head)
	{
		ListNode current = head;
		while(current!=null)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public ListNode reverse(ListNode head)
	{
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current!=null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseElementInSLL re = new ReverseElementInSLL();
		re.insert(5);
		re.insert(2);
		re.insert(7);
		re.insert(4);
		System.out.println("Given Singly Linked List:");
		re.displayList(re.head);
		System.out.println("Reversed Singly Linked List:");
		ListNode head=re.reverse(re.head);
		re.displayList(head);

	}

}
