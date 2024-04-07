/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    
    void postOrderTraversal(Node root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        
        //Left
        postOrderTraversal(root.left, al);
        
        //Right
        postOrderTraversal(root.right, al);
        
        //Node 
        
        al.add(root.data);
    }
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
      ArrayList<Integer> ans = new ArrayList();
      postOrderTraversal(root, ans);
      
      return ans;
    }
}
