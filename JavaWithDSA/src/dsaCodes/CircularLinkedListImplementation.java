//It is similar to singly linked list. Only difference - last node connected to first node
package dsaCodes;

import java.util.NoSuchElementException;

public class CircularLinkedListImplementation {
	
	private ListNode last;
	private int length;
	
	private class ListNode
	{
		private ListNode next;
		private int data;
		public ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public CircularLinkedListImplementation()
	{
		last = null;
		length=0;
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	//create circular linked list
	public void createCircularLinkedList()
	{
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(10);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}

	//print circular linked list
	public void display()
	{
		if(last==null)
		{
			return;
		}
		ListNode first = last.next;
		while(first!=last)
		{
			System.out.print(first.data+" ");
			first=first.next;
		}
		System.out.println(first.data+" ");
	}
	
	//insert a node at the start of a linked list
	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		if(last==null)
		{
			last = newNode;
		}
		else
		{
			newNode.next = last.next;
		}
		last.next = newNode;
		length++;
	}
	
	//insert a node at the end of a linked list
	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);
		if(last==null)
		{
			last = newNode;
			last.next = last;
			return;	
		}
		else
		{
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		length++;
	}
	
	//remove first node from circular linked list
	public ListNode deleteFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Circular singly linked list is already empty.");
		}
		ListNode temp = last.next;
		if(last.next==null)
		{
			last=null;
		}
		else
		{
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedListImplementation cll = new CircularLinkedListImplementation();
		cll.createCircularLinkedList();
		System.out.println("Print Circular Linked List:");
		cll.display();
		System.out.println("Insert a node at the beginning of circular linked list:");
		cll.insertFirst(2);
		cll.insertFirst(6);
		cll.display();
		System.out.println("Insert a node at the end of circular linked list:");
		cll.insertLast(4);
		cll.insertLast(7);
		cll.display();
		System.out.println("Remove first node from a circular linked list:");
		cll.deleteFirst();
		cll.deleteFirst();
		cll.display();

	}

}
