/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Tree
{
    
    int leave(Node node){
        if(node == null)return 0;
        
        if(node.left == null && node.right == null)return 1;
        
        int c = leave(node.left) + leave(node.right);
        
        return c;
    }
    
    int countLeaves(Node node) 
    {
         return leave(node);
    }
}
