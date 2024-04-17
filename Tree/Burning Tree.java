
class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int burn(Node root, int timer[], int target){
        if(root == null)return 0;
        
        if(root.data == target)return -1;
        
        int left = burn(root.left, timer, target);
        int right = burn(root.right, timer, target);
        
        if(left < 0){
            timer[0] = Math.max(timer[0], Math.abs(left) + right);
            return left - 1;
        }
        if(right < 0){
            timer[0] = Math.max(timer[0], Math.abs(right) + left);
            return right - 1;
        }
        
        return 1 + Math.max(left, right);
    }
    
    public static int minTime(Node root, int target) 
    {
        int timer[] = new int[1];
        int ans1 = burn(root, timer, target);
        
        Queue<Node> q = new LinkedList();
        q.offer(root);
        Node targetN = null;
        loop: while(!q.isEmpty()){
            int siz = q.size();
            
            for(int i = 0; i < siz; i++){
                Node temp = q.peek();
                
                if(temp.data == target){
                   targetN = temp;
                   break loop;
                }
                
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
                q.poll();
            }
            
        }
        
        Queue<Node> q1 = new LinkedList();
        int tDepth = 0;
        q1.offer(targetN);
         while(!q1.isEmpty()){
            int siz = q1.size();
            
            for(int i = 0; i < siz; i++){
                Node temp = q1.peek();
                
                if(temp.left != null){
                    q1.offer(temp.left);
                }
                if(temp.right != null){
                    q1.offer(temp.right);
                }
                q1.poll();
            }
            tDepth++;
        }
        
       
        return Math.max(timer[0], tDepth - 1);
        
    }
}
