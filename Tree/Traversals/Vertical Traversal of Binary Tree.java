class Solution
{
    
    static class Pair{
        Node node;
        int x_axis;
        Pair(Node node, int x_axis){
            this.node = node;
            this.x_axis = x_axis;
        }
    }
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer> al = new ArrayList();
        Queue<Pair> q = new LinkedList();
        q.offer(new Pair(root, 0));
       
        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap();
        tm.put(0, new ArrayList());
        ArrayList<Integer> tempAr = tm.get(0);
        tempAr.add(root.data);
        tm.put(0, tempAr);
        
        
        while(!q.isEmpty()){
            int siz = q.size();
            
            for(int i = 0; i < siz; i++){
                Pair temp = q.peek();
                
                if(temp.node.left != null){
                    q.offer(new Pair(temp.node.left, temp.x_axis - 1));
                    
                    if(tm.containsKey(temp.x_axis - 1)){
                        ArrayList<Integer> tempA = tm.get(temp.x_axis - 1);
                        tempA.add(temp.node.left.data);
                        tm.put(temp.x_axis - 1, tempA);
                    }
                    else{
                        tm.put(temp.x_axis - 1, new ArrayList());
                        ArrayList<Integer> tempA = tm.get(temp.x_axis - 1);
                        tempA.add(temp.node.left.data);
                         tm.put(temp.x_axis - 1, tempA);
                    }
                }
                
                if(temp.node.right != null){
                    q.offer(new Pair(temp.node.right, temp.x_axis + 1));
                    
                    if(tm.containsKey(temp.x_axis + 1)){
                        ArrayList<Integer> tempA = tm.get(temp.x_axis + 1);
                        tempA.add(temp.node.right.data);
                        tm.put(temp.x_axis + 1, tempA);
                    }
                    else{
                        tm.put(temp.x_axis + 1, new ArrayList());
                        ArrayList<Integer> tempA = tm.get(temp.x_axis + 1);
                        tempA.add(temp.node.right.data);
                         tm.put(temp.x_axis + 1, tempA);
                    }
                }
                
                q.poll();
                
            }
        }
        
        for(int i: tm.keySet()){
            ArrayList<Integer> temp = tm.get(i);
            
            for(int j: temp){
                al.add(j);
            }
        }
        
        return al;
        
        
       
    }
    
    //  static void find(Node root, int pos,int landr[]){
    //     if(root == null)return;
        
    //     landr[0] = Math.min(landr[0], pos);
    //     landr[1] = Math.max(landr[1], pos);
        
    //     find(root.left, pos - 1, landr);
    //     find(root.right, pos + 1, landr);
    // }
}
