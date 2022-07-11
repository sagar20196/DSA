package dsaCodes;

import java.util.Scanner;

public class SearchElementsInSLL extends ListNodeSLL {
	
	
	//Searching a particular node in linked list
	public boolean searchElement(int searchKey)
	{
		 ListNode current = head;
			while(current!=null)
			{
				if(current.data==searchKey)
				{
					return true;
				}
				current=current.next;
			}
		return false;
	}
	
	//Find middle node in a linked list
	public ListNode getMiddleNode()
	{
		if(head==null)
		{
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	//find nth node from the end of a linked list
	public ListNode getNthNodeFromEnd(int n)
	{
		if(head==null)
		{
			return null;
		}
		if(n<=0)
		{
			throw new IllegalArgumentException("Invalid value: n = "+n);
		}
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count=0;
		while(count<n)
		{
			if(refPtr==null)
			{
				throw new IllegalArgumentException(n+" is greater than the number of nodes in the list.");
			}
			refPtr =refPtr.next;
			count++;
		}
		while(refPtr!=null)
		{
			mainPtr=mainPtr.next;
			refPtr =refPtr.next;
		}
		return mainPtr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElementsInSLL se = new SearchElementsInSLL();
		se.insert(5);
		se.insert(2);
		se.insert(7);
		se.insert(4);
		se.insert(8);
		System.out.println("Singly Linked List:");
		se.display();
		System.out.println("Is the search key found? : "+se.searchElement(5));
		ListNode middleNode = se.getMiddleNode();
		System.out.println("Middle node is :"+middleNode.data);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the node position from end:");
		int n = sc.nextInt();
		ListNode node = se.getNthNodeFromEnd(n);
		System.out.println("Nth node from end is "+node.data);
		sc.close();

	}

}
