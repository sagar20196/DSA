package dsaCodes;

public class DetectLoopInSLL extends ListNodeClass{

	//Check whether the list contains loop or not
	public boolean containsLoop()
	{
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr = fastPtr.next.next;
			
			slowPtr = slowPtr.next;
			if(fastPtr==slowPtr)
			{
				return true;
			}
		}
		return false;
	}
	
	//Check starting point of a loop in Singly Linked List
	public ListNode startNodeOfALoop()
	{
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr==slowPtr)
			{
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}
	
	private ListNode getStartingNode(ListNode slowPtr)
	{
		ListNode temp = head;
		while(temp!=slowPtr)
		{
			temp=temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;//starting node of the loop
	}
	
	//creating a loop in linked list
	public void createLoopInLinkedList()
	{
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLoopInSLL dl = new DetectLoopInSLL();	
		dl.createLoopInLinkedList();
		System.out.println("Is loop present in linked list?: "+dl.containsLoop());
		System.out.println("Starting node of a loop where loop start:");
		System.out.println(dl.startNodeOfALoop().data);	
		
	}

}
