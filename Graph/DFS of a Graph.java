
class Solution {
    
    public void dfs(int node, ArrayList< ArrayList<Integer>> adj, 
                boolean visited[], ArrayList<Integer> ans){
                    
        visited[node] = true;
        ans.add(node);
        
        for(int i = 0; i < adj.get(node).size(); i ++){
            if(!visited[adj.get(node).get(i)]){
                dfs(adj.get(node).get(i), adj, visited, ans);
            }
        }
        
        return;
        
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList();
        boolean visited[] = new boolean[V];
        
        dfs(0, adj, visited, ans);
        
        return ans;
        
    }
}
