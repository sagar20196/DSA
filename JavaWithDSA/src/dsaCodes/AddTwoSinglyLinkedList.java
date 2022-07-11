//Given linked lists are in reverse order for ex: 7 4 9  and 5 6 so we have to add these in 9 4 7 and 6 5 order 
//such that result is 1 0 1 2 but it comes in reverse order i.e. 2 1 0 1 if we want exact result then reverse it 
//and each node contains single digit if contains two digit then carry over to next node

package dsaCodes;

public class AddTwoSinglyLinkedList extends ListNodeSLL {

	public static ListNode addTwoList(ListNode a, ListNode b)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		while(a!=null || b!=null)
		{
			int x = (a!=null)?a.data:0;
			int y = (b!=null)?b.data:0;
			int sum = carry + x + y;
			carry = sum/10;
			tail.next = new ListNode(sum%10);
			tail = tail.next;
			if(a!=null)
				a=a.next;
			if(b!=null)
				b=b.next;
		}
		if(carry>0)
		{
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoSinglyLinkedList as1 = new AddTwoSinglyLinkedList();
		as1.insert(9);
		as1.insert(4);
		as1.insert(7);
		System.out.println("List A:");
		as1.display();
		AddTwoSinglyLinkedList as2 = new AddTwoSinglyLinkedList();
		as2.insert(6);
		as2.insert(5);
		System.out.println("List B:");
		as2.display();
		System.out.println("Sum of List A and B is:");
		AddTwoSinglyLinkedList result = new AddTwoSinglyLinkedList();
		result.head = addTwoList(as1.head,as2.head);
		result.display();
		

	}

}
