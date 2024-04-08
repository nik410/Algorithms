class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {

        //Usage of level order traversal

        ArrayList<Integer> al = new ArrayList();
        
        Queue<Node> q = new LinkedList();
        
        q.add(root);
        al.add(root.data);
        while(!q.isEmpty()){
            int larg = -1;
            int siz = q.size();
            
            for(int i = 0; i < siz; i++){
                Node temp = q.peek();
                
                if(temp.left != null){
                    q.offer(temp.left);
                     larg = Math.max(temp.left.data, larg);
                }
                
                if(temp.right != null){
                    q.offer(temp.right);
                     larg = Math.max(temp.right.data, larg);
                }
                q.poll();
            }
            
            if(larg != -1)
            al.add(larg);
        }
        
        return al;
        
    }
}
