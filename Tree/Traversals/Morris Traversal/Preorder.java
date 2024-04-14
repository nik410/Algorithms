class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> al = new ArrayList();
        // Stack<Node> st = new Stack();
        
        // st.push(root);
        
        // while(!st.isEmpty()){
        //     Node temp = st.peek();
        //     al.add(temp.data);
        //     st.pop();
        //     if(temp.right != null){
        //         st.push(temp.right);
        //     }
        //     if(temp.left != null){
        //         st.push(temp.left);
        //     }
        // }
        
        // return al;
        
        while(root != null){
            if(root.left == null){
                al.add(root.data);
                root= root.right;
            }
            else{
            Node temp = root.left;
            
            while(temp.right != null && temp.right != root){
                temp = temp.right;
            }
            
            if(temp.right == null){
                al.add(root.data);
                temp.right = root;
                root = root.left;
            }
            else{
                temp.right = null;
                root = root.right;
            }}
        }
        
        return al;
        
    }
    
    
}
