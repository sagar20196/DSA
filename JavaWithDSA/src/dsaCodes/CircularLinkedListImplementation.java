//It is similar to singly linked list. Only difference - last node connected to first node
package dsaCodes;

public class CircularLinkedListImplementation extends ListNodeSLL {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedListImplementation cll = new CircularLinkedListImplementation();
		cll.createCircularLinkedList();
		

	}

}
