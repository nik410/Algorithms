
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (o1, o2) -> Integer.compare(o2,o1));
        
        for(int i: arr){
            if(pq.size() == k){
                int max = pq.peek();
                if(i < max){
                    pq.remove();
                    pq.add(i);
                }
            }
            else{
                pq.add(i);
            }
        }
        
        return pq.remove();
    } 
}
