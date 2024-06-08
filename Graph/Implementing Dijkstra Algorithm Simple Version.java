

//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {

      // TC : O(V^2) due to the fact that we are searching for min val node each tim
      // SC : O(V)
        int explored[] = new int[V];
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        
        int c = 0;
        while(c != V){
            int node = -1, val = Integer.MAX_VALUE;
            
            //Select of the node from which the next route is to be determined
            
            for(int i = 0; i < V; i ++){
                if(explored[i] == 0 && val > dist[i]){
                    node = i;
                    val = dist[i];
                }
            }
            
            explored[node] = 1;
            
            for(int i = 0; i < adj.get(node).size(); i ++){
                int neigh = adj.get(node).get(i).get(0);
                int wei = adj.get(node).get(i).get(1);
                
                if(explored[neigh] == 0 && dist[neigh] > dist[node] + wei){
                    dist[neigh] = dist[node] + wei;
                }
            }            
            c++;           
        }       
        return dist;
    }
}
