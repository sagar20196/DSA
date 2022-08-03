package treeCodes;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal extends BinaryTree {
	
	//print binary tree node with level order
	public void levelOrder()
	{
		if(root==null)
		{
			return;
		}
		//here we use queue for printing elements of a binary tree with FIFO technique
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty())
		{
			TreeNode temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{
				queue.offer(temp.left);
			}
			if(temp.right!=null)
			{
				queue.offer(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal lo = new LevelOrderTraversal();
		lo.createBinaryTree();
		System.out.println("Print Binary Tree using Level Order Traversal:");
		lo.levelOrder();

	}

}
