class Solution {
    static int splitArray(int[] arr , int N, int K) {
       int l = 0, r = 0, ans = -1;
       
       for(int i: arr){
           l = Math.max(l, i);
           r += i;
       }
       
       while(l <= r){
           int mid = l + (r - l) / 2;
           
           int splitCount = 1, sum = 0;
           for(int i: arr){
               if(sum + i <= mid){
                   sum += i;
               }
               else{
                   splitCount++;
                   sum = i;
               }
           }
           
           if(splitCount <= K){
               ans = mid;
               r = mid - 1;
           }
           else{
               l = mid + 1;
           }
       }
       
       return ans;
    }
}
