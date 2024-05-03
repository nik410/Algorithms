class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        
        for(int i: gifts){
            pq.add(i);
        }
        long ans = 0;
        while(k -- > 0){
            int max = pq.remove();
            int sqroot = (int)Math.sqrt(max);
            pq.add(sqroot);
        }

        while(pq.size() > 0){
            ans += pq.remove();
        }


        return ans;

    }
}
