
class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        int ans[] = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
        for(int i = 0; i < arr.length; i++){
            if(pq.size() == k){
                int min = pq.peek();
                
                if(arr[i] > min){
                    pq.remove();
                    pq.add(arr[i]);
                }
                ans[i] = pq.peek();
                
            }
            else{
                 pq.add(arr[i]);
                if(pq.size() == k){
                    ans[i] = pq.peek();
                }
                else{
                    ans[i] = -1;
                    
                } 
            }
        }
        
        
        return ans;
    }
};
