class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> al = new ArrayList();
        // Stack<Node> st = new Stack();
        
        // Node n = root;
        
        // while(true){
        //     if(n != null){
        //         st.push(n);
        //         n = n.left;
        //     }
        //     else{
        //         if(st.isEmpty())break;
        //         n = st.pop();
        //         al.add(n.data);
        //         n = n.right;
        //     }
        // }
        
        // return al;
        
        
        while(root != null){
            if(root.left == null){
                al.add(root.data);
                root = root.right;
            }
            else{
                
                Node temp = root.left;
                while(temp.right != null && temp.right != root){
                    temp = temp.right;
                }
                //Left Subtree not traversed or not
                if(temp.right == null){
                    temp.right = root;
                    root = root.left;
                }
                    
                else{
                        temp.right = null;
                        al.add(root.data);
                        root = root.right;
                }
            }
            
        }
        
        return al;
        
        
        
    }
    
    
}
