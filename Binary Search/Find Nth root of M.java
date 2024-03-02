public class Solution {

    public static int value(int n, int mid, int m){
        
        int midpown = (int)Math.pow(mid, n);

        if(midpown == m)return 0;
        else if(midpown < m)return -1;
        else{
            return 1;
        }
    }
    public static int NthRoot(int n, int m) {
        
        int l = 0, r = 2;
        int ans = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            if(value(n, mid, m) == 0)return mid;
            else if(value(n, mid, m) == -1){
                 l = mid + 1;
                 r *= 2;
             }
             else{
                 r = mid - 1;
             }
        }

        return ans;
    }
}
