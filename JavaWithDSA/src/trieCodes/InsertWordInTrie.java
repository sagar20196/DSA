package trieCodes;

public class InsertWordInTrie extends Trie {
	
	//inserting words in Trie
	public void insert(String word)
	{
		if(word==null || word.isEmpty())
		{
			throw new IllegalArgumentException("Invalid input");
		}
		
		word = word.toLowerCase();
		
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) 
		{
			char c = word.charAt(i);
			int index = c - 'a';
			if(current.children[index]==null)
			{
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			}
			else
			{
				current = current.children[index];
			}
		}
		current.isWord = true;
	}
	
	public boolean search(String word)
	{
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertWordInTrie ins = new InsertWordInTrie();
		ins.insert("cat");
		ins.insert("Car");
		ins.insert("Sunday");
		ins.insert("sun");
		System.out.println("Values inserted successfully !!");

	}

}
