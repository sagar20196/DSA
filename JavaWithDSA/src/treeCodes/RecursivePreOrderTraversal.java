package treeCodes;

public class RecursivePreOrderTraversal extends BinaryTree {

	//PreOrder Traversal of a binary tree using recursion
	public void preOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//creating binary tree
	public void binaryTree()
	{
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursivePreOrderTraversal pt = new RecursivePreOrderTraversal();
		pt.binaryTree();
		pt.preOrder(pt.root);

	}

}
