/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    public static void kthLar(Node root, int ans[], int kArr[]){
        if(root == null)return;


      //As we know inorder (LNR) gives ascending order similary RNL gives descending which will be helpul in calculation of kth Largest 
        kthLar(root.right, ans, kArr);
        
        kArr[0]--;
        
        if(kArr[0] >= 0)ans[0] = root.data;
        else{
            return;
        }
        
        kthLar(root.left, ans, kArr);
        
        
    }
    public int kthLargest(Node root,int K)
    {
        int ans[] = new int[1];
        int kArr[] = new int[1];
        kArr[0] = K;

        //As we know inorder (LNR) gives ascending order similary RNL gives descending which will be helpul in calculation of kth Largest      
        kthLar(root, ans, kArr);
        
        return ans[0];
    }
}
