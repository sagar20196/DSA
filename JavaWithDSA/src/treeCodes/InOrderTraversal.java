package treeCodes;

import java.util.Stack;

public class InOrderTraversal extends BinaryTree{
	
	//InOrder Traversal of a binary tree using recursion
	public void recursiveInOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		recursiveInOrder(root.left);
		System.out.print(root.data+" ");
		recursiveInOrder(root.right);
	}
	
	//InOrder Traversal of a binary tree using iteration
	public void iterativeInOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty()|| temp!=null)
		{
			if(temp!=null)
			{
				stack.push(temp);
				temp = temp.left;
			}
			else
			{
				temp = stack.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InOrderTraversal rt = new InOrderTraversal();
		rt.createBinaryTree();
		System.out.println("In Order Traversal using recursion:");
		rt.recursiveInOrder(rt.root);
		System.out.println();
		System.out.println("In Order Traversal using iteration:");
		rt.iterativeInOrder(rt.root);

	}

}
