class Solution {
    public int nthUglyNumber(int n) {
        ArrayList<Integer> al = new ArrayList();

        //The selection of ranges is done using hit and trial it can also be verified by cross checking larger inputs answers

        for(int i = 0; i < 31; i ++){             
            for(int j = 0; j < 25; j ++){                 
                for(int k = 0; k < 20; k ++){
                    int num = (int) (Math.pow(2, i) * Math.pow(3, j) * Math.pow(5, k));                   
                    al.add(num);
                }
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue(n, Collections.reverseOrder());
        for(int i: al){
            if(pq.size() == n){
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
        // System.out.println(pq);
        return pq.remove();

    }
}
