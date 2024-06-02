class Solution {
    
    class Pair{
        int edge;
        int weight;
        
        Pair(int edge, int weight){
            this.edge = edge;
            this.weight = weight;
        }
    }
    

	public int[] shortestPath(int N,int M, int[][] edges) {
	
		
		ArrayList<ArrayList<Pair>> adj = new ArrayList();
		
		for(int i = 0; i < N; i ++){
		    adj.add(new ArrayList<Pair>());
		}
		
		for(int i = 0; i < edges.length; i ++){
		    adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
		}
		
      	//System.out.println(adj);
        
        // Finding Topo Sort Using DFS
        int path[] = new int[N];
        boolean visited[] = new boolean[N];
        Stack<Integer> st = new Stack();
        
        for(int i = 0; i < N; i ++){
            if(!visited[i]){
                dfsTopo(i, adj, visited, st);
            }
        }
        
        // System.out.println("Stack: " +  st);
		
		int dist[] = new int[N];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dist[0] = 0;
		
		// Very important to look overflow condition that may arise
		
		while(!st.isEmpty()){
		    int curr = st.pop();
		    
		    for(Pair p: adj.get(curr)){
		        if (dist[curr] != Integer.MAX_VALUE ) {
                    dist[p.edge] = Math.min(dist[curr] + p.weight, dist[p.edge]);
                }
		    }		    
		}		
		
		for(int i = 0; i < dist.length; i ++){
		    if(dist[i] == Integer.MAX_VALUE){
		        dist[i] =  -1;
		    }
		}	
		
		return dist;
	}
	
	public void dfsTopo(int node, ArrayList<ArrayList<Pair>> adj,
	      boolean visited[], Stack<Integer> st){
	        
	         visited[node] = true;
	         
	         for(Pair i: adj.get(node)){
	             if(!visited[i.edge]){
	                 dfsTopo(i.edge, adj, visited, st);
	             }
	         }
	         
	         st.push(node);
	     }
}
