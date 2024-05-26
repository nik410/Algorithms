class Solution
{
    
    public boolean isBi(int node, ArrayList<ArrayList<Integer>>adj, int color[], int currColor){
        color[node] = currColor;
        
        for(int i: adj.get(node)){
            if(color[node] == color[i])return false;
            
            if(color[i] == -1){
                int newColor = 1 - currColor;
                
                if(isBi(i, adj, color, newColor) == false)return false;
            }
        }
        
        return true;
    }
    
    
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Using DFS
        
        // int color[] = new int[V];
        // Arrays.fill(color, -1);
        // for(int i = 0; i < V; i ++){
        //     if(color[i] == -1){
        //         if(isBi(i, adj, color, 0) ==  false) return false;
        //         // 0 - green
        //         // 1 - blue
        //     }
        // }
        
        // return true;
        
        //Using BFS
        
        int color[] = new int[V];
        Arrays.fill(color, -1);
        
        
        for(int i = 0; i < V; i ++){
            if(color[i] == -1){
                if(isBiUsingBFS(i, adj, color, 1) == false)return false;
                }       
            
        }
        return true;              
       
        
    }
    
     public boolean isBiUsingBFS(int node, ArrayList<ArrayList<Integer>>adj, int color[], int currColor){
         
          Queue<Integer> q = new LinkedList();
          q.offer(node);
          color[node] = currColor;
          while(!q.isEmpty()){
             
            int currNode = q.poll();
            for(int j: adj.get(currNode)){
              if(color[currNode] == color[j])return false;
              else if(color[j] == -1){
                    int newColor = 1 - color[currNode];
                    q.offer(j);
                    color[j] = newColor;
                                          
                    }
                }
              
          }
          return true;
         
     }
}
