class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> pq = new PriorityQueue();
        
        for(long i: arr){
            pq.add(i);
        }
        long ans = 0;
        while(pq.size() > 1){
            long min1 = pq.remove();
            long min2 = pq.remove();
            
            ans += min1 + min2;
            pq.add(min1 + min2);
            
        }
        
        return ans;
    }
}
