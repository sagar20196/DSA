package treeCodes;

public class BinarySearchTree{

	protected TreeNode root;
	
	public class TreeNode
	{
		protected TreeNode left;
		protected TreeNode right;
		protected int data;
		
		public TreeNode(int data)
		{
			this.data = data;
		}
	}
	
	//calling insert method 
	public void insert(int value)
	{
		root = insert(root, value);
	}
	
	//insert nodes in Binary Search Tree(BST) using recursion
	public TreeNode insert(TreeNode root, int value)
	{
		if(root==null) //base case
		{
			root = new TreeNode(value);
			return root;
		}
		
		if(value<root.data)
		{
			root.left = insert(root.left, value);
		}
		else
		{
			root.right = insert(root.right,value);
		}
		return root;
	}
	
	//calling In order method
	public void inOrder()
	{
		inOrder(root);
	}
	
	//print nodes of BST using in order traversal via recursion
	public void inOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(1);
		bst.insert(7);
		System.out.println("Insert nodes in binary search tree:");
		bst.inOrder();
		
	}

}
