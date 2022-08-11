/* Max Heap(Max Priority Queue)
 * A Max Heap is a complete binary tree in which each node value is >= than the values of its children.
 * The maximum value is at the top which is root of complete binary tree. For its array representation its at
 	index 1 i.e. heap[1]
 */

package maxHeapCodes;

//Initial or basic implementation of max heap
public class MaxPriorityQueue {
	
	protected Integer[] heap;
	protected int n;
	
	public MaxPriorityQueue(int capacity)
	{
		heap = new Integer[capacity + 1]; //here we take capacity + 1 because in max heap we leave 1st index empty
		n=0;
	}
	
	public boolean isEmpty()
	{
		return n == 0;
	}
	
	public int size()
	{
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxPriorityQueue mh = new MaxPriorityQueue(3);
		System.out.println(mh.size());
		System.out.println(mh.isEmpty());

	}

}

