class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        
        // Using Kahn's Algo (BFS)
    //   ArrayList<ArrayList<Integer>> adj = new ArrayList();
       
    //   for(int i = 0; i < n; i ++){
    //       adj.add(new ArrayList());
    //   }
       
    //   int indegree[] = new int[n];
       
    //   for(int i = 0; i < prerequisites.size(); i ++){
    //       adj.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
           
    //       indegree[prerequisites.get(i).get(0)] ++;
    //   }
       
    //   //System.out.println(adj);
       
    //   Queue<Integer> q = new LinkedList();
       
    //   for(int i = 0; i < n; i ++){
    //       if(indegree[i] == 0){
    //           q.offer(i);
    //       }
    //   }
       
    //   int ans[] = new int[n];
    //   int index = 0;
       
    //   while(!q.isEmpty()){
    //       int curr = q.poll();
    //       ans[index ++] = curr;
           
    //       for(int i: adj.get(curr)){
    //           indegree[i] --;
    //           if(indegree[i] == 0){
    //               q.offer(i);
    //           }
    //       }
    //   }
       
       
    //   if(index == n)return ans;
    //   else
    //   return new int[]{};
    
    //Using DFS
    
    ArrayList<ArrayList<Integer>> adj = new ArrayList();
    
    for(int i = 0; i < n; i ++){
        adj.add(new ArrayList());
    }
    
    for(int i = 0; i < prerequisites.size(); i ++){
          adj.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
      }
      
    boolean visited[] = new boolean[n];
    int path[] = new int[n];
    
    Stack<Integer> st = new Stack();
    
    for(int i = 0; i < n; i++){
        if(!visited[i]){
            if(dfs(i, adj, path, visited,st) == false)return new int[]{};
        }
    }
    
    
    int ans[] = new int [n];
    
    for(int i = 0; i < n; i ++){
        ans[i] = st.pop();
    }
    
    return ans;
    
    
}
    public static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int path[],
    boolean visited[], Stack<Integer> st){
        visited[node] = true;
        path[node] = 1;
        
        for(int i: adj.get(node)){
            if(path[i] == 1)return false;
            
            if(!visited[i] && dfs(i, adj, path, visited, st) == false)return false;
        }
    
    
    st.push(node);
    
    path[node] = 0;
    
    return true;
        
    }
}
