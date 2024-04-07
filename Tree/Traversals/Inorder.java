/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    
    void inOrderTraversal(Node root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
       
        //Left
        inOrderTraversal(root.left, al);
        
        //Node
        al.add(root.data);
        
        //Right
        inOrderTraversal(root.right, al);
        
    }
    
    ArrayList<Integer> inOrder(Node root) {
     
       ArrayList<Integer> al = new ArrayList();
       inOrderTraversal(root, al);
       return al;
    }
}
