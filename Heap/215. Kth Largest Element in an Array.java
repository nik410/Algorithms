class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();

        for(int i: nums){
            if(pq.size() == k){
                int min = pq.peek();

                if(i > min){
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
