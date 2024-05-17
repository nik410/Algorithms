
class Solution{
    static int maxNumbers(int n, int k, int a[]){
        int l = 0;
        int ans = 0;
        int start = 1;
        int c = 0;

        Arrays.sort(a);
        
        while(ans < k){
            if(l >= n || a[l] != start){
                if(ans + start < k)c++;
                ans += start;
            }
            else{
                
                l++;
                
            }
            start++;
        }
        
        return c;
    }
}
