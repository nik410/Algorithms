

import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
	
}

public class TreeCreationUsingQueueAndLinkedlist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root val: ");
		int x = sc.nextInt();
		
		TreeNode root = new TreeNode(x);
		
		int leftChildVal, rightChildVal;
				
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			//Left Child Insertion
			
			System.out.println("Enter left child of "+q.peek().data+": ");
			
			leftChildVal = sc.nextInt();
			if(leftChildVal != -1) {
				System.out.println();
				TreeNode temp = new TreeNode(leftChildVal);
				
				q.peek().left = temp;
				q.add(temp);				
			}
			
			//Right Child Insertion
			System.out.println("Enter right child of "+q.peek().data+": ");
			rightChildVal = sc.nextInt();
			if(rightChildVal != -1) {
				System.out.println();
				TreeNode temp = new TreeNode(rightChildVal);
				
				q.peek().right = temp;
				q.add(temp);				
			}
			
			q.poll();
			
		}
		
	}

}
