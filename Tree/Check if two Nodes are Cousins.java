/*
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
//User function Template for Java

class Solution {
    
    // Returns true if the nodes with values 'a' and 'b' are cousins. Else returns false
    public boolean isCousins(Node root, int a, int b) {
        // your code here
        // This function should return true if x and y are cousins, else return false
        
        //Using the concept of level order traversal
        
        Queue<Node> q = new LinkedList();
        
        int levela = -1, levelb = -1;
        Node parenta = null, parentb = null;
        
        q.offer(root);
        int lv = 0;
        while(!q.isEmpty()){
            
            int siz = q.size();
            
            for(int i =0; i < siz; i++){
                Node temp = q.peek();
                
                if(temp.left != null){
                    q.offer(temp.left);
                    if(temp.left.data == a){
                        parenta = temp;
                        levela = lv;
                    }
                    if(temp.left.data == b){
                        parentb = temp;
                        levelb = lv;
                    }
                }
                
                if(temp.right != null){
                    q.offer(temp.right);
                    if(temp.right.data == a){
                        parenta = temp;
                        levela = lv;
                    }
                    if(temp.right.data == b){
                        parentb = temp;
                        levelb = lv;
                    }
                }
                
                q.poll();
            }
            if(levela != -1 && levelb != -1)break;
            lv++;
        }
        
        
        if(levela == levelb && parenta != parentb)return true;
        else{
            return false;
        }
        
    }

}
