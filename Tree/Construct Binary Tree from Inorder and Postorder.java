
class GfG
{
    
    public static Node tree(int in[], int post[], int index, int inStart, int inEnd){
        if(inStart > inEnd)return null;
        
        Node root = new Node(post[index]);
        int pos = find(in, post[index], inStart, inEnd);
        
        root.right = tree(in, post, index - 1, pos + 1, inEnd);
        root.left = tree(in, post, index - (inEnd - pos) - 1, inStart, pos - 1);
        
        return root;
        
    }
    
    public static int find(int in[], int target, int inStart, int inEnd){
        //Use of Map can bring the searching tc of O(n) to O(1) as in a 
        //valid tree no duplicates will be there
        for(int i = inStart; i <= inEnd; i++){
            if(in[i] ==  target) return i;
        }
        return -1;
    }
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        
        
        return tree(in, post, n - 1, 0, n - 1);
    }
}
