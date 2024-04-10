/* A Binary Tree node 

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> al = new ArrayList();
        Stack<Node> st = new Stack();
        
        Node n = root;
        
        while(true){
            if(n != null){
                st.push(n);
                n = n.left;
            }
            else{
                if(st.isEmpty())break;
                n = st.pop();
                al.add(n.data);
                n = n.right;
            }
        }
        
        return al;
        
        
        
    }
    
    
}
