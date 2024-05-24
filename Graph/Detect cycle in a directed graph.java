
class Solution {
    // Function to detect cycle in a directed graph.
    
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int path[], boolean visited[]){
        path[node] = 1;
        visited[node] = true;
        
        for(int i: adj.get(node)){
            if(path[i] == 1)return true;
            
            if(visited[i])continue;
            
            if(dfs(i, adj, path, visited))return true;
            
        }
        
        path[node] = 0;
        return false;
    }
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
    //     int path[] = new int[V];
    //     boolean visited[] = new boolean[V];
        
    //     for(int i = 0; i < V; i ++){
    //         if(!visited[i]){
    //             if(dfs(i, adj, path, visited)) return true;
    //     }
    // }
    //     return false;
    
    
    
    // Using Kahn Algo (BFS) which is used for Topological sort 
    // which is possible for DAG only
    
    int indegree[] =  new int[V];
    
    for(int i = 0; i < adj.size(); i ++){
        for(int j = 0; j < adj.get(i).size(); j ++){
            indegree[adj.get(i).get(j)]++;
        }
    }
    
    ArrayList<Integer> al = new ArrayList();
    
    Queue<Integer> q = new LinkedList();
    
    for(int i = 0; i < V; i ++){
        if(indegree[i] == 0)q.offer(i);
    }
    
    while(!q.isEmpty()){
        int siz = q.size();
        
        for(int i = 0; i < siz; i ++){
            int curr = q.poll();
            al.add(curr);
            indegree[curr] = -100;
            for(int j = 0; j < adj.get(curr).size(); j ++){
                indegree[adj.get(curr).get(j)]--;
                 if(indegree[adj.get(curr).get(j)] == 0)q.offer(adj.get(curr).get(j));
            }       
        }
    }
    
    if(al.size() == V)return false;
    else return true;
     
    
    }
}
