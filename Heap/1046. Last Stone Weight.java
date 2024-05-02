class Solution {
    public int lastStoneWeight(int[] stones) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int i: stones){
            pq.add(i);
        }

        while(pq.size() > 1){
            int max1 = pq.remove();
            int max2 = pq.remove();

            if(max1 != max2)pq.add(max1 - max2);

        }
        if(pq.size() == 1)
        return pq.remove();
        else return 0;
    }
}
