
class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    
    // void inorder(Node root, ArrayList<Integer> al){
    //     if(root == null)return;
        
    //     inorder(root.left, al);
    //     al.add(root.data);
    //     inorder(root.right, al);
    // }
    
      boolean inorder(Node root, int prev[]){
        if(root == null) return true;
        
        boolean left = inorder(root.left, prev);
        
        if(root.data <= prev[0]) return false;// compare with parent node's data
    
        prev[0] = root.data;
        boolean right = inorder(root.right, prev);
    
    
        return left && right;
    }
    
    boolean isBST(Node root)
    {
    //   ArrayList<Integer> al = new ArrayList();
       
    //   inorder(root, al);
       
    //   for(int i = 0; i < al.size() - 1; i++){
    //       if(al.get(i) - al.get(i + 1) >= 0)return false;
    //   }
       
    //   return true;
    int prev[] = new int[1];
    prev[0] = Integer.MIN_VALUE;
    
    //Very Very Important Keep in mind that java passes primitive type by value 
    //So primitive cannot be used so use array as its reference is passed as value
    //Which Solves the problem
    return inorder(root,  prev);
    }
}
