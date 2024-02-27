public class Solution {
    public static int upperBound(int []arr, int x, int n){
        int l = 0, r = arr.length - 1;

        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] <= x){
                l = mid + 1;
            }
            else{
                r = mid - 1;                
            }
        }

        return l;

    }
}
