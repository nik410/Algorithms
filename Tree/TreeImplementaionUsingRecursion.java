import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		right = left = null;
	}
	
}

public class TreeImplementation {
	
	static Scanner sc = new Scanner(System.in);
	
	public static TreeNode binaryTree() {
		int x;
		x = sc.nextInt();
		if(x == -1)return null;
		
		TreeNode temp = new TreeNode(x);
		System.out.println("Enter left child of " + temp.data +": ");
		temp.left = binaryTree();
		System.out.println("Enter right child of " + temp.data +": ");
		temp.right = binaryTree();
		
		return temp;		
	}

	public static void main(String[] args) {
		TreeNode rootNode;
		System.out.println("Enter root Node: ");
		rootNode = binaryTree();
		
		//Time complexity: O(n)
		//Space Complexity: In average casees like balanced binary tree or such O(height of tree)
		//		    In worst case that is a tree like a linked list O(n) where n is number of nodes
	}

}
