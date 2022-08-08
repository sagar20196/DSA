package treeCodes;

public class ValidateBST extends BinarySearchTree {
	
	public boolean isValid(TreeNode root, long min, long max)
	{
		if(root==null)
		{
			return true;
		}
		if(root.data<=min || root.data>=max)
		{
			return false;
		}
		boolean left = isValid(root.left,min,root.data);
		if(left)
		{
			boolean right = isValid(root.right,root.data,max);
			return right;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateBST vb = new ValidateBST();
		vb.insert(5);
		vb.insert(7);
		vb.insert(4);
		vb.insert(8);
		vb.insert(2);
		System.out.println("Given Binary Search tree:");
		vb.inOrder();
		System.out.println();
		System.out.println("Is given Binary Search Tree valid? : "+vb.isValid(vb.root, Long.MIN_VALUE, Long.MAX_VALUE));

	}

}
