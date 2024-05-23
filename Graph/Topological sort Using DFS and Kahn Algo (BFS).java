
class Solution
{
    
    static void dfs(int node, boolean visited[], Stack st, ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;
        
        for(int al: adj.get(node)){
            if(!visited[al]){
                    dfs(al, visited, st, adj);
            }
           
        }
         st.push(node);
        
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        //Using DFS 
        
        // Stack<Integer> st = new Stack();
        // boolean visited[] = new boolean[V];
        
        // for(int i = 0; i < V; i ++){
        //     if(!visited[i]){
        //         dfs(i, visited, st, adj);
        //     }
        // }
        
        // int ans[] = new int[V];
        // int i = 0;
        // while(!st.isEmpty()){
        //     ans[i++] = st.pop();
        // }
        
        // return ans;
        
        
        // Using Kahn Algo (BFS) 
        
        int indegree[] = new int[V];
        int ans[] = new int[V];
        int index = 0;
        boolean visited[] = new boolean[V];
        
        for(int i = 0; i <adj.size(); i ++){
            for(int j = 0; j < adj.get(i).size(); j ++){
                indegree[adj.get(i).get(j)]++;
            }
        }
        
        Queue<Integer> q = new LinkedList();
        
        for(int i = 0; i < V; i ++){
            if(indegree[i] == 0){
                q.add(i);
                visited[i] = true;
            }
        }
        
        while(!q.isEmpty()){
            int siz = q.size();
            
            for(int i = 0; i < siz; i ++){
                int curr = q.poll();
                ans[index ++] = curr;
                for(int j: adj.get(curr)){
                    indegree[j]--;
                }
                
                for(int j = 0; j < V; j ++){
                    if(indegree[j] == 0 && !visited[j]){
                        q.add(j);
                         visited[j] = true;
                    }
                }
                
            }
        }
        
        return ans;
        
    }
}
