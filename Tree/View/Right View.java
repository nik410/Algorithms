
/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    
    
    void rightViewUsingRec(Node root, int level, ArrayList<Integer> ans){
        if(root == null)return;
        
        if(level == ans.size())ans.add(root.data);
        
        rightViewUsingRec(root.right, level + 1, ans);
        rightViewUsingRec(root.left, level + 1, ans);
    }
    
    
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        
        ArrayList<Integer> ans = new ArrayList();
        
        rightViewUsingRec(node, 0, ans);
        
        return ans;
        // Queue<Node> q = new LinkedList();
        
        // q.offer(node);
        
        
        // while(!q.isEmpty()){
        //     int siz = q.size();
        //     int right = -1;
        //     for(int i = 0; i < siz; i++){
        //         Node temp = q.peek();
        //         right = temp.data;
        //         if(temp.left != null){
        //             q.offer(temp.left);
        //         }
                
        //         if(temp.right != null){
        //             q.offer(temp.right);
        //         }
                
        //         q.poll();
        //     }
        //     ans.add(right);
        // }
        
        // return ans;
        
    }
}

