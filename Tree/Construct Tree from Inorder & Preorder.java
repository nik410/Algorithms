
class Solution
{
    public static Node tree(int inorder[], int preorder[], int index, int inStart, int inEnd){
        if(inStart > inEnd)return null;
        
        Node root = new Node(preorder[index]);
        
        int pos = find(inorder, preorder[index], inStart, inEnd);
        
        root.left = tree(inorder, preorder, index + 1, inStart, pos - 1);
        root.right = tree(inorder, preorder, index + (pos + 1 - inStart), pos + 1, inEnd);
        
        return root;
    }
    
    public static int find(int inorder[], int target, int start, int end){
        
        for(int i = start; i <= end; i++){
            if(target == inorder[i])return i;
        }
        
        return -1;
    }
    
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        return tree(inorder, preorder, 0, 0, n - 1);
    }
}
