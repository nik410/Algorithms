package Arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class BinarySearchTreeImplementation {
	
	static class TreeNode{
		
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			
			this.data = data;
			left = right = null;
		}
	}
	
//	public static TreeNode insertUsingIterartive(TreeNode root, int target) {
//		TreeNode temp = root;
//		if(root == null) {
//			TreeNode addNode =new TreeNode(target);
//			root = addNode;
//			return root;
//		}
//		while(temp != null) {
//			if(target > root.data) {
//				if(temp.left == null) {
//					TreeNode addNode =new TreeNode(target);
//					temp.left = addNode;
//				}
//				else
//					temp = temp.left;
//			}
//			else {
//				if(temp.right == null) {
//					TreeNode addNode =new TreeNode(target);
//					temp.right = addNode;
//				}
//				else
//					temp = temp.right;
//			}
//		}
//		
//		return root;
//		
//	}

	//Using Recursion
	
	public static TreeNode insert(TreeNode root, int target) {
		
		if(root == null) {
			TreeNode temp = new TreeNode(target);
			return temp;
		}
		
		if(target > root.data) {
			root.right = insert(root.right, target);
		}
		else {
			root.left = insert(root.left, target);
		}
		
		return root;
		
	}
	
	public static boolean search(TreeNode root, int target) {
		if(root == null)return false;
		if(root.data == target)return true;
		
		boolean left = search(root.left, target);
		boolean right = search(root.right, target);
		
		return left || right;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		TreeNode root = null;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			root = insert(root, arr[i]);
		}

		//Insertion Worst Time complexity: O(n) in case of a stricly increasing or decreasing and overall creation of bst is O(n^2)
		


		//Searching an element takes average tc of O(log n) while worst is O(n) in strictly increasing or decreasing  
		System.out.println(search(root, 50));
		
//		Queue<TreeNode> q = new LinkedList();
//		q.add(root);
//		
//		while(!q.isEmpty()) {
//			for(int i = 0; i < q.size(); i++) {
//				TreeNode temNode = q.peek();
//				
//				if(temNode.left != null) {
//					q.add(temNode.left);
//				}
//				
//				if(temNode.right != null) {
//					q.add(temNode.right);
//				}
//				
//				System.out.println(q.poll().data);
//			}
//		}
//		
//		
		

	}

}
