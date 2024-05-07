
class Solution
{
    public static void inOrder(Node root, ArrayList<Integer> in){
        if(root == null)return;
        
        inOrder(root.left, in);
        in.add(root.data);
        inOrder(root.right, in);
    }
    
    
    
    public static void postOrder(Node root, ArrayList<Integer> in, int index[]){
        if(root == null)return;
        
        postOrder(root.left, in, index);
        postOrder(root.right, in, index);
        root.data = in.get(index[0]++);
    }
    
    public static void convertToMaxHeapUtil(Node root)
    {
        ArrayList<Integer> in = new ArrayList();
        
        inOrder(root, in);
        
        //Filling the BST using postorder traversal
        int index[] = new int[1];
        postOrder(root, in, index);
        
        
        
    }
}
