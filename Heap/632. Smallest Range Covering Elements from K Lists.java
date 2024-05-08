class Solution {

    class Pair{
        int data;
        int col;
        int index;

        Pair(int data,int col, int index){
            this.data = data;
            this.col = col;
            this.index = index;
        }
    }

    class myComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return p1.data - p2.data;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Pair> pq = new PriorityQueue(new myComparator());
        int maxi = Integer.MIN_VALUE, min = 0;
        int ans[] = new int[2];
      
        
        for(int i = 0; i < nums.size(); i ++){
            pq.add(new Pair(nums.get(i).get(0), i, 0));
            maxi = Math.max(maxi, nums.get(i).get(0));
        }

        ans[0] = pq.peek().data;
        ans[1] = maxi;

        while(!pq.isEmpty()){
            Pair temp = pq.remove();           

            if(ans[1] - ans[0] > maxi - temp.data){
                ans[0] =  temp.data;
                ans[1] = maxi;           
            }         

            if(temp.index + 1 < nums.get(temp.col).size()){
                pq.add(new Pair(nums.get(temp.col).get(temp.index + 1), temp.col, temp.index + 1));
                maxi = Math.max(maxi, nums.get(temp.col).get(temp.index + 1));
                min = pq.peek().data;
            }
            else{
                break;
            }
        }        

        return ans;
    }
}
