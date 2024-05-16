
class Solution {
    static int assignMiceHoles(int N , int[] M , int[] H) {
       Arrays.sort(M);
       Arrays.sort(H);
       int ans = M[0] - H[0];
       
       for(int i = 0; i < N; i ++){
           ans = Math.max(Math.abs(M[i] - H[i]), ans);
       }
       
       return ans;
    }
};
