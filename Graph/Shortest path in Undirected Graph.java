class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList();
        
        for(int i = 0; i < n; i ++){
            adj.add(new ArrayList());
        }
        
        for(int i[]: edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        
        
        Queue<Integer> q = new LinkedList();
        boolean visited[] = new boolean[n];
        int dist[] = new int[n];
        
        q.offer(src);
        visited[src] = true;
        dist[src] = 0;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            
            for(int i: adj.get(curr)){
                if(visited[i] == true)continue;
                
                q.offer(i);
                visited[i] = true;
                dist[i] = dist[curr] + 1;
                
            }
        }
        
        for(int i = 0; i < n; i ++){
            if(dist[i] == 0 &&i != src){
                dist[i] = -1;
            }
        }
        
        return dist;       
    }
}
