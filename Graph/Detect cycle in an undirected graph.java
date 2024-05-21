// class Solution {
//     // public void dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, 
//     //                     boolean visited[], int ans[]){
//     //     visited[node] = true;
        
       
//     //     for(int i = 0; i < adj.get(node).size(); i ++){
//     //         int newNode = adj.get(node).get(i);
            
//     //         if(newNode == parent)continue;
//     //         if(visited[newNode] ==  true){
//     //             ans[0] = 1;
//     //             }
            
//     //         if(visited[newNode] == false)dfs(newNode, node, adj, visited,ans);
//     //   }
      
//       public boolean cycle(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean visited[]){
        
//         visited[node] = true;
        
//         for(int i = 0; i < adj.get(node).size(); i ++){
//             int newNode = adj.get(node).get(i);
            
//             if(newNode == parent)continue;
//             if(visited[newNode] ==  true){
//                 return true;
//                 }
            
//             if(cycle(newNode, node, adj, visited))
//                 return true;
//             }
            
//       return false;
//     }
    
    
//     public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
//       boolean visited[] = new boolean[V];
//     //   int ans[] = new int[1];
//       for(int i = 0; i < V; i ++){
//             if(!visited[i])    
//                 if(cycle(i, -1, adj, visited))return true;
           
//       }
      
//       return false;
       
//     }
// }


class Solution {
    // public void dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, 
    //                     boolean visited[], int ans[]){
    //     visited[node] = true;
        
       
    //     for(int i = 0; i < adj.get(node).size(); i ++){
    //         int newNode = adj.get(node).get(i);
            
    //         if(newNode == parent)continue;
    //         if(visited[newNode] ==  true){
    //             ans[0] = 1;
    //             }
            
    //         if(visited[newNode] == false)dfs(newNode, node, adj, visited,ans);
    //   }
      
    public boolean bfs(int nodeNa, ArrayList<ArrayList<Integer>> adj, boolean visited[]){
         Queue<int[]> q = new LinkedList();
                
                q.add(new int[]{nodeNa, -1});
                visited[nodeNa] = true;
                while(!q.isEmpty()){
                    int temp[] = q.poll();
                    int node = temp[0];
                    int parent = temp[1];
                    
                    for(int n: adj.get(node)){
                        
                        if(n == parent)continue;
                        if(visited[n]){
                            return true;
                        }
                        
                        visited[n] = true;
                        q.offer(new int[]{n, node});
                    }
                }
                
                return false;
    }
    
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean visited[] = new boolean[V];
        
        //Using bfs 
        for(int i = 0; i < V; i ++){
            
            if(!visited[i]){
               if(bfs(i, adj, visited))return true;
                
            }
        }   
        return false;
        
        
       
    }
}
