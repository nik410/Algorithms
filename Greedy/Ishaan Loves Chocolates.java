class Solution {
    public static int chocolates(int n, int[] arr) {
        int ans = arr[0];
        for(int i: arr){
            ans = Math.min(ans, i);
        }
        
        return ans;
        
    }
}
        
