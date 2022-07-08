package dsaCodes;

public class MergeTwoSortedLinkedList extends ListNodeClass {
	
	//Merge two sorted linked list
	public static ListNode merge(ListNode a, ListNode b)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(a!=null && b!=null)
		{
			if(a.data<=b.data)
			{
				tail.next = a;
				a = a.next;
			}
			else
			{
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		
		if(a==null)
		{
			tail.next =b;
		}
		else
		{
			tail.next =a;
		}
		return dummy.next; //we are returning dummy.next because we assign dummy.next to list head so we 
						   //don't need dummy node anymore
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedLinkedList m1 = new MergeTwoSortedLinkedList();
		m1.insert(2);
		m1.insert(6);
		m1.insert(3);
		m1.insert(1);
		m1.insert(7);
		System.out.println("Sorted Linked List A:");
		m1.sortList();
		m1.display();
		MergeTwoSortedLinkedList m2 = new MergeTwoSortedLinkedList();
		m2.insert(4);
		m2.insert(8);
		m2.insert(5);
		System.out.println("Sorted Linked List B:");
		m2.sortList();
		m2.display();
		System.out.println("Linked List after merge:");
		MergeTwoSortedLinkedList result = new MergeTwoSortedLinkedList();
		result.head = merge(m1.head,m2.head);
		result.display();
		
		
	}

}
