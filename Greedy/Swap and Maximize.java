
class GFG
{
    long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
        
        long ans = 0;
        int l = 0, r = n - 1;
        while(l < r){
            ans += Math.abs(arr[r] - arr[l]);
            ans += Math.abs(arr[r] - arr[l + 1]);
            r--;
            l++;
        }
        
        ans += Math.abs(arr[l] - arr[0]);
        
        return  ans;
        
    }
}
