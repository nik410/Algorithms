
class Solution
{
     static class Triple{
        int val;
        int row;
        int col;
        
         Triple(int val, int row, int col){
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }
    
     static class MyComparator implements Comparator<Triple> {
        public int compare(Triple t1, Triple t2){
            // if(t1.val == t2.val){
            return t1.val - t2.val;
                
            // }
        }
    }
    
    
	public static int kthSmallest(int[][]mat,int n,int k)
	{
       PriorityQueue<Triple> pq = new PriorityQueue(k, new MyComparator());
       
       for(int i = 0; i < n; i++){
           pq.add(new Triple(mat[i][0], i, 0));
       }
       
       int ans = 0;
       
       while(k-- > 0){
           ans = pq.peek().val;
           
           Triple temp = pq.remove();
           int newR = temp.row;
           int newC = temp.col + 1;
           
           if(newC < n){
               pq.add(new Triple(mat[newR][newC], newR, newC));
           }
       }      
       return ans;      
    }
}
