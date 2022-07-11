package dsaCodes;

public class SinglyLinkedListImplementation extends ListNodeSLL{
	
	//Finding length of a linked list
	public int findLength()
	{
		if(head==null)
		{
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	//Inserting a node at the starting of a linked list
	public void insertFirstPos(int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	//Inserting a node at last of a linked list
	public void insertLastPos(int value)
	{
		ListNode newNode = new ListNode(value);
		if(head==null)
		{
			head = newNode;
			return;
		}
		ListNode current = head;
		while(current.next!=null)
		{
			current = current.next;
		}
		current.next= newNode;
		
	}
	
	//Inserting a node at a given pos
	public void insertAtPos(int value,int pos)
	{
		ListNode newNode = new ListNode(value);
		if(pos==1)
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			ListNode previous = head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current = previous.next;
			newNode.next = current;
			previous.next=newNode;
		}
	}

	//Deleting first node of a linked list
	public ListNode deleteFirst()
	{
		if(head==null)
		{
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		//temp=null;
		return temp;
	}
	
	//Deleting last node of a linked list
	public ListNode deleteLast()
	{
		if(head==null|| head.next==null)
		{
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next= null;
		//current = null;
		return current;
	}
	
	//Deleting a node at a given position from a linked list
	public void deleteAtGivenPos(int pos)
	{
		if(pos==1)
		{
			head=head.next;
		}
		else
		{
			ListNode previous = head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current  = previous.next;
			previous.next = current.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListImplementation sll = new SinglyLinkedListImplementation();
		sll.head= new ListNode(10);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(8);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		System.out.println("Given Linked list :");
		sll.display();
		System.out.println("Length of a linked list : "+sll.findLength());
		sll.insertFirstPos(7);
		sll.insertFirstPos(9);
		sll.insertFirstPos(5);
		System.out.println("Inserted node at first position:");
		sll.display();
		sll.insertLastPos(6);
		sll.insertLastPos(9);
		System.out.println("Inserted node at last position:");
		sll.display();
		sll.insertAtPos(12, 3);
		System.out.println("Insert node at a given position:");
		sll.display();
		sll.deleteFirst();
		System.out.println("Delete first node of a linked list");
		sll.display();
		sll.deleteLast();
		System.out.println("Delete last node of a linked list");
		sll.display();
		sll.deleteAtGivenPos(4);
		System.out.println("Delete node at a given position");
		sll.display();
	}

}
