package linkedListCodes;

import java.util.NoSuchElementException;

public class DoublyLinkedListImplementation extends ListNodeDLL {
	
	//Insert node at the beginning of a linked list
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
	
	//Insert node at the end of a linked list
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
	
	//Delete first node of a linked list
	public ListNode deleteFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if(head==tail)
		{
			tail = null;
		}
		else
		{
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	//Delete last node of a linked list
		public ListNode deleteLast()
		{
			if(isEmpty())
			{
				throw new NoSuchElementException();
			}
			ListNode temp = tail;
			if(head==tail)
			{
				head = null;
			}
			else
			{
				tail.previous.next = null;
			}
			tail = tail.previous;
			temp.previous = null;
			return temp;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListImplementation dll1 = new DoublyLinkedListImplementation();
		dll1.insertLast(4);
		dll1.insertLast(1);
		dll1.insertLast(5);
		dll1.insertLast(8);
		System.out.println("Insert node at the beginning of Doubly Linked List:");
		dll1.displayForward();	// 4 1 5 8
		dll1.displayBackward(); // 8 5 1 4
		DoublyLinkedListImplementation dll2 = new DoublyLinkedListImplementation();
		dll2.insertFirst(4);
		dll2.insertFirst(1);
		dll2.insertFirst(5);
		dll2.insertFirst(8);
		System.out.println("Insert node at the end of Doubly Linked List:");
		dll2.displayBackward();
		dll2.displayForward();
		System.out.println("Delete first node of a linked list:");
		dll1.deleteFirst();
		dll2.deleteFirst();
		dll1.displayForward();
		dll2.displayForward();
		System.out.println("Delete last node of a linked list:");
		dll1.deleteLast();
		dll2.deleteLast();
		dll2.displayBackward();
		dll1.displayBackward();
	}

}
