package maxHeapCodes;

public class MaxHeapOperations extends MaxPriorityQueue{ 	

	public MaxHeapOperations(int capacity) 
	{
		super(capacity);
	}
	
	//Bottom-Up Reheapify technique or Swim technique in Max Heap to insert node
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

	}

}
