package treeCodes;

import java.util.Stack;

public class PreOrderTraversal extends BinaryTree{
	
	//PreOrder Traversal of a binary tree using recursion
	public void recursivePreOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+ " ");
		recursivePreOrder(root.left);
		recursivePreOrder(root.right);
	}
	
	//PreOrder Traversal of a binary tree using iteration 
	public void iterativePreOrder(TreeNode root)
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreOrderTraversal it = new PreOrderTraversal();
		it.createBinaryTree();
		System.out.println("Pre Order Traversal using recursion:");
		it.recursivePreOrder(it.root);
		System.out.println();
		System.out.println("Pre Order Traversal using Iteration:");
		it.iterativePreOrder(it.root);

	}

}
