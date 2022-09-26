package treeCodes;

import java.util.Stack;

/*
 * Give the root of a binary tree, check whether it is a mirror of itself i.e. symmetric around its center.
   Example --
                   1
                /    \
               2       2
             /   \   /   \
            3     4 4     3
     
    Symmetric means mirror image when it turns from the root and looks similar left subtree = right subtree
           
 */

public class SymmetricTree extends BinaryTree{
	
	public boolean isSymmetric(TreeNode root)
	{
		if(root==null)
		{
			return true;
		}
		Stack<TreeNode> stk = new Stack<>();
		stk.push(root.right);
		stk.push(root.left);
		while(!stk.isEmpty())
		{
			TreeNode n1 = stk.pop();
			TreeNode n2 = stk.pop();
			if(n1==null && n2==null)
				continue;
			if(n1==null || n2 == null ||n1.data !=n2.data)
				return false;
			stk.push(n1.left);
			stk.push(n2.right);
			stk.push(n1.right);
			stk.push(n2.left);
		}
		return true;
	}
	
	public void createBinaryTree()
	{
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(2);
		TreeNode fourth = new TreeNode(3);
		TreeNode fifth = new TreeNode(4);
		TreeNode sixth = new TreeNode(4);
		TreeNode seventh = new TreeNode(3);

		
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
		SymmetricTree st = new SymmetricTree();
		st.createBinaryTree();
		boolean b = st.isSymmetric(st.root);
		System.out.println("Is given binary tree Symmetric? : "+ b);

	}

}
