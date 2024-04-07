
// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    
    static void preOrderTraversal(Node root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        
        //Node 
        al.add(root.data);
        
        //Left
        preOrderTraversal(root.left, al);
        
        //Right 
        
        preOrderTraversal(root.right, al);
    }
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList();
        preOrderTraversal(root, ans);
        
        return ans;
        
    }

}
