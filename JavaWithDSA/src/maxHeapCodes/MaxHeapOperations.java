package maxHeapCodes;

public class MaxHeapOperations extends MaxPriorityQueue{ 	

	public MaxHeapOperations(int capacity) 
	{
		super(capacity);
	}
	
	//Bottom-Up Reheapify technique or Swim technique to insert node in Max Heap
	public void insert(int x)
	{
		if(n==heap.length-1)
		{
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
	
	private void swim(int k)
	{
		while(k>1 && heap[k/2]<heap[k])
		{
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2; //because we need to continue shifting up till new value inserted is at correct position
		}
	}

	//resize the array if given size of array is full
	private void resize(int capacity) 
	{
		Integer[] temp = new Integer[capacity];
		for(int i=0; i<heap.length; i++)
		{
			temp[i] = heap[i];
		}
		heap = temp;
	}
	
	//Top-Down Reheapify or Sink or Shift Down Technique to delete max node in Max Heap
	public int deleteMax()
	{
		int max = heap[1];
		swap(1,n); //Here we are swapping max value with the last node value of the max heap
		n--;
		sink(1);  /*Here we are calling sink method to check the parent node with child node whether it is greater
	    		  	than child nodes or not if not then we compare both child node first in those which one is
					greater we swap it with its parent node.
				  */
		heap[n+1] = null; //after deleting the node we assign null to that position where we remove the node
		if(n>0 && (n==(heap.length-1)/4)) //if we call delete operation several times then there will be null 
			//null at the last so for free that memory we will resize it what we needed.
		{
			resize(heap.length/2);
		}
		return max;
	}
	
	//calling sink method to validate Max Heap 
	private void sink(int k)
	{
		while(2*k<=n)
		{
			int j = 2*k;
			if(j<n && heap[j]<heap[j+1]) //Here comparing child nodes and checking j less than n or not
			{
				j++;
			}
			if(heap[k]>=heap[j]) // checking whether parent node is greater or equals to child or not
			{
				break;
			}
			swap(k,j);
			k = j; //after swapping we assign j position to k for validating further child node with parent node
		}
	}
	
	//swapping nodes
	private void swap(int a ,int b)
	{
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	//print nodes of max heap
	public void printMaxHeap()
	{
		for(int i=1; i<=n; i++)
		{
			System.out.print(heap[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeapOperations m = new MaxHeapOperations(3);
		m.insert(4);
		m.insert(5);
		m.insert(2);
		m.insert(6);
		m.insert(1);
		m.insert(3);
		System.out.println("Size of Priority Queue or Max Heap: "+m.size());
		System.out.println("Max Heap in correct order is:");
		m.printMaxHeap();
		MaxHeapOperations n = new MaxHeapOperations(9);
		n.insert(9);
		n.insert(3);
		n.insert(6);
		n.insert(2);
		n.insert(1);
		n.insert(5);
		n.insert(4);
		System.out.println();
		System.out.println("Given Max Heap:");
		n.printMaxHeap();
		n.deleteMax();
		System.out.println();
		System.out.println("After Deleting max value from Max Heap Now Max Heap Looks like:");
		n.printMaxHeap();

	}

}
