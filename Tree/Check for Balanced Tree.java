/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
    static int recHei(Node node, int valid[]){
        
        if(node == null)return 0;
        
        int leftH = recHei(node.left, valid);
        int rightH = recHei(node.right, valid);
        
        if(Math.abs(leftH - rightH) > 1) valid[0] = -1;
        
        return 1 + Math.max(leftH, rightH);
       
    }
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
       int valid[] = new int[1];
        int h = recHei(root, valid);
        
       if(valid[0] == 0)return true;
       return false;
    }
}

