package trieCodes;

/*
 * Trie - Trie basically comes from the word Retrieval.
 * The main purpose of this data structure is to retrieve stored information very fast.
 * A trie with 4 words - 1. dog  2. dust  3. hat  4. home
   Example -       root -  EmptyNode
   						  /		    \
   						 d			 h
   					   /    \	   /    \
   					  o		 u    a	     o ----- TrieNode
   					  |      |    |      |
   					  g      s    t      m
   					         |           |
   					         t           e ---- end of word
  					  
 *  Applications - Auto-Complete words 
 *  Auto-complete feature is implemented by tries.
 *  Many websites have used auto-complete feature, which suggest user rest of the word, while user is typing.
 *  Searching a person contact number in contact list is efficiently implemented by trie. As soon as user enters 
 	letters the application suggest the name of the person.
 *  Applications - Spell Checking
 *  Tries help to check and correct word spelling entered by user. In case user doesn't know exact spelling it 
 	auto suggest the correct spelling.
 	
 * TrieNode - A TrieNode in a trie represents a single alphabet of the word. 
 * In above example, in order to insert word "dog" 3 TrieNode are used, one for each alphabet.
 * A TrieNode class in trie consists of two data members:
 * 1. TrieNode[] children - An array which refers to other TrieNodes in Trie, also called as child nodes of a
 	  TrieNode. The size of array is usually taken as 26(if we are storing English words).
   2. boolean isWord - A boolean value to indicate the end of word. This value is set as true when a word is 
   	  inserted completely.
   	  
 * Implementation of the Trie Class
 * A Trie will be implemented using TrieNode class.
 * A root TrieNode is at top with empty value having 26 links (one per alphabet).
 * The links are either null or points to another TrieNode.
 	
 */

public class Trie {
	
	protected TrieNode root;
	
	public Trie()
	{
		root = new TrieNode(); //root is empty
	}
	
	public class TrieNode{
		
		protected TrieNode[] children;
		protected boolean isWord;
		
		public TrieNode()
		{
			this.children = new TrieNode[26]; // starting english words - a -> z
			this.isWord = false;
		}
		
	}

}
