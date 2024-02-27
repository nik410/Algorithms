public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
       int ans = 0;

       int l = 0, r = arr.length - 1;

       while(l <= r){
           int mid = l +(r - l)/2;
           if(arr[mid] < x)l = mid + 1;
           else if(arr[mid] >= x){
               r = mid - 1;
           }
       }

       return l;
    }
}
