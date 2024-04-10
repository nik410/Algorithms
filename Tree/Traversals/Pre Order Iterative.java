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
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> al = new ArrayList();
        Stack<Node> st = new Stack();
        
        st.push(root);
        
        while(!st.isEmpty()){
            Node temp = st.peek();
            al.add(temp.data);
            st.pop();
            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left != null){
                st.push(temp.left);
            }
        }
        
        return al;
        
    }
    
    
}
