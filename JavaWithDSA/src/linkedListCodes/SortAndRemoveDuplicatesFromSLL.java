package linkedListCodes;

public class SortAndRemoveDuplicatesFromSLL extends ListNodeSLL {
	
	//Insert a new node in sorted linked list that won't effect on sorting order
	public ListNode insertInSortedList(int value)
	{
		ListNode newNode = new ListNode(value);
		if(head==null)
		{
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		while(current!=null && current.data<newNode.data)
		{
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	//Remove Duplicates from linked list
	public void removeDuplicates()
	{
		if(head==null)
		{
			return;
		}
		ListNode current = head;
		while(current!=null && current.next!=null)
		{
			if(current.data==current.next.data)
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
		}
	}
	
	//Remove a specific key from linked list
	public void removeKey(int key)
	{
		ListNode current = head;
		ListNode temp = null;
		if(current!=null && current.data==key)
		{
			head = current.next;
			return;
		}		
		while(current!=null && current.data!=key)
		{
			temp = current;
			current = current.next;
		}
		if(current==null)
		{
			return;
		}
		temp.next = current.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortAndRemoveDuplicatesFromSLL sr = new SortAndRemoveDuplicatesFromSLL();
		sr.insert(8);
		sr.insert(1);
		sr.insert(9);
		sr.insert(4);
		sr.insert(2);
		sr.insert(1);  
		sr.insert(3);
		sr.insert(2);
		System.out.println("Given Linked List:");
		sr.display();
		System.out.println("Sorted Linked List:");
		sr.sortList();
		sr.display();
		System.out.println("Remove Duplicates from given sorted list:");
		sr.removeDuplicates();
		sr.display();
		System.out.println("Inserted new node in a sorted linked list:");
		sr.insertInSortedList(5);
		sr.display();
		System.out.println("Remove a given key from linked list");
		sr.removeKey(5);
		sr.display();

	}

}
