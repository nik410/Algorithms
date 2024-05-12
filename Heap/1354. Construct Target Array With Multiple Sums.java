class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int tSum = 0;
        for(int i: target){
            tSum += i;
            pq.add(i);
        }

        //System.out.println(pq);

        int maxEle, remSum, changeValue;

        while(pq.peek() != 1){
            
            maxEle = pq.peek();
            pq.poll();

            remSum = tSum - maxEle;

            if(remSum <= 0 || remSum >= maxEle )return false;

            changeValue = maxEle % remSum;

            if(chanegeValue == 0){
                if(remSum != 1)return false;
                else return true;
            }

            pq.add(changeValue);
            tSum = remSum + changeValue;
        }

        return true;
    }
}
