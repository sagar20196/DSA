package queueCodes;

public class EnQueue extends Queue {
	
	//insert an element in queue
	public void enqueue(int value)
	{
		ListNode temp = new ListNode(value);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnQueue q = new EnQueue();
		q.enqueue(5);
		q.enqueue(9);
		q.enqueue(7);
		q.enqueue(10);
		System.out.println("Insert an element in queue:");
		q.display();

	}

}
