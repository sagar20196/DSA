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
	
	//Put key-value pair in Hash Table
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
	
	//get value using key from Hash Table
	public String get(Integer key)
	{
		if(key==null)
		{
			throw new IllegalArgumentException("Key is null !!");
		}
		
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head = head.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyValuePairInHashTable hs = new KeyValuePairInHashTable(10);
		hs.put(105, "Tom");
		hs.put(21, "Sana");
		hs.put(21, "Harry");
		hs.put(31, "Mary");
		System.out.println("Number of Key-Value pair in Hash Table:\n"+hs.size);
		String s1 = hs.get(21);
		String s2 = hs.get(45);
		String s3 = hs.get(105);
		System.out.println("Get value using Key from Hash Table:\n"+ s1+"\n"+s2+"\n"+s3);

	}

}
