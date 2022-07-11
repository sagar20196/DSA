package dsaCodes;

public class DoublyLinkedListImplementation extends ListNodeDLL {
	
	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		if(isEmpty())
		{
			tail = newNode;
		}
		else
		{
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListImplementation dll1 = new DoublyLinkedListImplementation();
		dll1.insertLast(4);
		dll1.insertLast(1);
		dll1.insertLast(5);
		dll1.insertLast(8);
		System.out.println("Insert node at the beginning of Doubly Linked List:");
		dll1.displayForward();
		dll1.displayBackward();
		DoublyLinkedListImplementation dll2 = new DoublyLinkedListImplementation();
		dll2.insertFirst(4);
		dll2.insertFirst(1);
		dll2.insertFirst(5);
		dll2.insertFirst(8);
		System.out.println("Insert node at the end of Doubly Linked List:");
		dll2.displayBackward();
		dll2.displayForward();

	}

}
