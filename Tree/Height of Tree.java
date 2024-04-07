/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int recHei(Node node){
        
        if(node == null)return 0;
        
        return 1 + Math.max(recHei(node.left), recHei(node.right));
    
        
    }
    
    int height(Node node) 
    {
        //return recHei(node);
        
        
        //Using Level order Traversal
      
        int heiAns = 0;
        Queue<Node> q = new LinkedList();
        
        q.add(node);
        
        while(!q.isEmpty()){
            int siz = q.size();
            
            for(int i = 0; i < siz; i++){
                Node curr = q.peek();
                
                if(curr.left != null)q.offer(curr.left);
                
                if(curr.right != null)q.offer(curr.right);
                
                q.poll();
            }
            
            
            heiAns++;
        }
        
        return heiAns;
    }
}
