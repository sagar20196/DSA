package treeCodes;

public class MaxValueInBinaryTree extends BinaryTree {
	
	//find max value in Binary Tree using recursion
	public int findMax(TreeNode root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left>result)
		{
			result = left;
		}
		if(right>result)
		{
			result = right;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxValueInBinaryTree mx = new MaxValueInBinaryTree();
		mx.createBinaryTree();
		System.out.println("Maximum value in binary tree is:\n"+mx.findMax(mx.root));

	}

}
