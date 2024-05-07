
class Solution {
    
    int countNodes(Node tree){
        if(tree == null){
            return 0;
        }
        
        return 1 + countNodes(tree.left) + countNodes(tree.right);
    }
    
    boolean checkCBT(Node tree, int index, int nodeCount){
        if(tree == null)return true;
        
        if(index >= nodeCount){
            return false;
        }
        
        boolean left = checkCBT(tree.left, 2 * index + 1, nodeCount);
        boolean right = checkCBT(tree.right, 2 * index + 2, nodeCount);
        
        return left && right;
        
    }
    
    boolean isHeap(Node tree) {
        
        int nodeCount = countNodes(tree);
        //System.out.println(nodes);
        
        //Checking if the tree is complete binary tree or not
        
        boolean completeOrNot = checkCBT(tree, 0, nodeCount);
        if(completeOrNot == false)return false;
        
        // Checking the heap conditipn that is if parent is greater than its child 
        // for all nodes
        
        Queue<Node> q = new LinkedList();
        q.add(tree);
        
        while(!q.isEmpty()){
            int siz = q.size();
            
            for(int i = 0; i < siz; i++){
                Node temp = q.poll();
                
                if(temp.right != null){
                    Node rightN = temp.right;
                    q.offer(rightN);
                    if(rightN.data > temp.data)return false;                    
                }
                
                if(temp.left != null){
                    Node leftN = temp.left;
                    q.offer(leftN);
                    if(leftN.data > temp.data)return false;
                    
                }
            }
        }    
        
        return true;
        
    }
}
