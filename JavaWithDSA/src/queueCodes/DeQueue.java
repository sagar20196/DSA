package queueCodes;

import java.util.NoSuchElementException;

public class DeQueue extends EnQueue{
	
	//remove element from queue i.e. from front
	public int dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		
		int result = front.data;
		front = front.next;
		if(front==null)
		{
			rear = null;
		}
		length--;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeQueue d = new DeQueue();
		d.enqueue(12);
		d.enqueue(10);
		d.enqueue(45);
		System.out.println("Given Queue:");
		d.display();
		d.dequeue();
		d.dequeue();
		d.dequeue();
		System.out.println("Queue after removing elements:");
		d.display();

	}

}
