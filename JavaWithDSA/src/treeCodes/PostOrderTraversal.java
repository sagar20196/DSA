package treeCodes;

import java.util.Stack;

public class PostOrderTraversal extends BinaryTree{
	
	//Post Order Traversal of a binary tree using recursion
	public void recursivePostOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		recursivePostOrder(root.left);
		recursivePostOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	//Post Order Traversal of a binary tree using iteration
	public void iterativePostOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		while(current!=null||!stack.isEmpty())
		{
			if(current!=null)
			{
				stack.push(current);
				current = current.left;
			}
			else
			{
				TreeNode temp = stack.peek().right;
				if(temp==null)
				{
					temp = stack.pop();
					System.out.print(temp.data+" ");
					while(!stack.isEmpty() && temp==stack.peek().right)
					{
						temp = stack.pop();
						System.out.print(temp.data+" ");
					}
				}
				else
				{
					current = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOrderTraversal pot = new PostOrderTraversal();
		pot.createBinaryTree();
		System.out.println("Post Order Traversal using recursion:");
		pot.recursivePostOrder(pot.root);
		System.out.println();
		System.out.println("Post Order Traversal using iteration:");
		pot.iterativePostOrder(pot.root);

	}

}
