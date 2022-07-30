package treeCodes;

import java.util.Stack;

public class IterativePreOrderTraversal extends BinaryTree{
	
	//PreOrder Traversal of a binary tree using iteration 
	public void preOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode temp = stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
			{
				stack.push(temp.right);
			}
			if(temp.left!=null)
			{
				stack.push(temp.left);
			}
		}
	}
	
	//creating binary tree
	public void binaryTree()
	{
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
			
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterativePreOrderTraversal it = new IterativePreOrderTraversal();
		it.binaryTree();
		System.out.println("Pre Order Traversal using Iteration:");
		it.preOrder(it.root);

	}

}
