package hashingCodes;

/*How the key-value pair put in a HashTable using put function(Separate Chaining Collision)
 * 									21 
 * 								  /
 * key --> Hash Function --> index -- 31
 * 								  \   
 * 									21
 */
public class KeyValuePairInHashTable extends HashTable {
	
	public KeyValuePairInHashTable(int capacity)
	{
		super(capacity);
	}
	
	public void put(Integer key, String value)
	{
		if(key==null || value==null)
		{
			throw new IllegalArgumentException("Key or value is null !!");
		}
		
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		size++;
		head = buckets[bucketIndex];
		HashNode node = new HashNode(key,value); //(key,value) --> null
		node.next = head;
		buckets[bucketIndex] = node;
		
	}
	
	public int getBucketIndex(int key)
	{
		return key % numOfBuckets;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyValuePairInHashTable hs = new KeyValuePairInHashTable(10);
		hs.put(105, "Tom");
		hs.put(21, "Sana");
		hs.put(21, "Harry");
		hs.put(31, "Mary");
		System.out.println("Number of Key-Value pair in Hash Table:\n"+hs.size);

	}

}
