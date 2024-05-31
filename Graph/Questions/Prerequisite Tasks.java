//User function Template for Java

class Solution {
    public boolean isPossible(int N,int P, int[][] prerequisites)
    {
        // Using Kahn Algo (BFS)
        
        // ArrayList<ArrayList<Integer>> adj = new ArrayList();
        // int indegree[] = new int[N];
        
        // for(int i = 0; i < N; i ++){
        //     adj.add(new ArrayList());
        // }
        
        // for(int i = 0; i < prerequisites.length; i ++){
        //     adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        //     indegree[prerequisites[i][1]] ++;
        // }
        
        // // System.out.println(adj);
        // Queue<Integer> q = new LinkedList();
        // ArrayList<Integer> ans = new ArrayList();
        
        // for(int i = 0; i < N; i ++){
        //     if(indegree[i] == 0){
        //         q.offer(i);
        //         indegree[i] = -100;
        //     }
        // }
        
        // while(!q.isEmpty()){
        //     int curr = q.poll();
        //     ans.add(curr);
        //     for(int i: adj.get(curr)){
        //         indegree[i] --;
                
        //         if(indegree[i] == 0){
        //             q.offer(i);
        //              indegree[i] = -100;
        //         }
        //     }
        // }
        
        // // System.out.println(ans);
        
        
        // if(ans.size() == N)
        // return true;
        // else{
        //     return false;
        // }
        
        
        
        //Using DFS 
        
        int path[] = new int[N];
        boolean visited[] = new boolean[N];
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList();
        
        for(int i = 0; i < N; i ++){
            adj.add(new ArrayList());
        }
        
        for(int i = 0; i < P; i ++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        for(int i = 0; i < N; i ++){
            if(!visited[i]){
                if(dfs(i, adj, path, visited) == false)return false;
            }
        }
        
        // System.out.println(adj);
        
        
        return true;
        
    }
    
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int path[], boolean visited[]){
        visited[node] = true;
        path[node] = 1;
        
        for(int i: adj.get(node)){
            if(path[i] == 1){
                return false;
            }
            
            if(visited[i])continue;
            
            if(dfs(i, adj, path, visited) == false)return false;
        }
        
        path[node] = 0;
        
        return true;
    }
    
    
}
