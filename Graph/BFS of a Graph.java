class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList();
        q.add(0);
        
        ArrayList<Integer> al = new ArrayList();
        boolean visited[] = new boolean[V];
        visited[0] = true;
        while(!q.isEmpty()){
            
            al.add(q.peek());
            for(int i = 0; i < adj.get(q.peek()).size(); i ++){
                int ver = adj.get(q.peek()).get(i);
                if(visited[ver] == false){
                    q.offer(ver);
                    visited[ver] = true;
                }
            }            
            q.poll();            
        }        
        return al;
    }
}
