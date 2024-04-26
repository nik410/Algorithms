//User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}*/

class Solution
{
    
    public static TNode buildBST(ArrayList<Integer> al, int low, int high){
        
        if(low > high)return null;

      //Important to use this specific mid finding formulae
        int mid = high + (low - high) / 2;
        TNode root = new TNode(al.get(mid));
        
        root.left = buildBST(al, low, mid - 1);
        root.right = buildBST(al, mid + 1, high);
        
        return root;
        
        
    }
    
    public TNode sortedListToBST(LNode head)
    {
        LNode temp = head;
        ArrayList<Integer> al = new ArrayList();
        
        while(temp != null){
            al.add(temp.data);
            temp = temp.next;
        }
        
        return buildBST(al, 0, al.size() - 1);
    }
}
