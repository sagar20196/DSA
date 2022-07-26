package treeCodes;

public class BinaryTree {

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
	
	//creating binary tree and assign nodes accordingly
	public void createBinaryTree()
	{
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
