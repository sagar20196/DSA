//It is similar to singly linked list. Only difference - last node connected to first node
package dsaCodes;

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

	}

}
