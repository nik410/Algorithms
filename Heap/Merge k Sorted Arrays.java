
class Solution
{
    static class Triple{
        int data;
        int i; 
        int j;
        
        Triple(int data, int i, int j){
            this.data = data;
            this.i = i;
            this.j = j;
        }
    }
    
    static class TComparator implements Comparator<Triple>{
        public int compare(Triple t1, Triple t2){
            return t1.data - t2.data;
        }
    }
    
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> ans = new ArrayList();
        PriorityQueue<Triple> pq = new PriorityQueue(new TComparator());
        
        for(int i = 0; i < arr.length; i++)
        pq.add(new Triple(arr[i][0], i, 0));
        
        while(pq.size() > 0){
            Triple min = pq.remove();
            ans.add(min.data);
            int x = min.i;
            int y = min.j;
            
            if(y + 1 < arr[0].length){
                pq.add(new Triple(arr[x][y+1], x, y + 1));
            }           
        }
        
        return ans;      
    }
}
