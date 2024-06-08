

//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static class Pair{
        int wei;
        int node;
        
        Pair(int wei, int node){
            this.wei = wei;
            this.node = node;
        }      
    }
    
    static class MyComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return Integer.compare(p1.wei, p2.wei);
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {

        //Used in Sparse Graph 
        // TC : O(elogv)
        // SC : O(v + e)
        
        int explored[] = new int[V];
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue(new MyComparator());
        pq.offer(new Pair(0, S));
        
        int c = 0;
        while(c != V){
            
            Pair minN = pq.poll();
            int node = minN.node;
            
            if(explored[node] == 1)continue;
            
            //Select of the node from which the next route is to be determined
            
            // for(int i = 0; i < V; i ++){
            //     if(explored[i] == 0 && val > dist[i]){
            //         node = i;
            //         val = dist[i];
            //     }
            // }
            
            explored[node] = 1;
            
            for(int i = 0; i < adj.get(node).size(); i ++){
                int neigh = adj.get(node).get(i).get(0);
                int wei = adj.get(node).get(i).get(1);
                
                if(explored[neigh] == 0 && dist[neigh] > dist[node] + wei){
                    dist[neigh] = dist[node] + wei;
                    pq.offer(new Pair(dist[neigh], neigh));
                }
            }
            
            c++;
            
        }
        
        
        
        return dist;
    }
}
