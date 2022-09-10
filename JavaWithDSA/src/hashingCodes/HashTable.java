package hashingCodes;

public class HashTable {
	
	protected HashNode [] buckets;
	protected int numOfBuckets;  //capacity
	protected int size;	//number of key-value pairs in hash table or number of hash nodes in a hash table
	
	public HashTable(int capacity)
	{
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}
	
	protected class HashNode{
		
		protected Integer key; //Can be generic type
		protected String value; //Can be generic type
		protected HashNode next; //reference to next node 
		
		public HashNode(Integer key, String value)
		{
			this.key = key;
			this.value = value;
		}		
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}

}
