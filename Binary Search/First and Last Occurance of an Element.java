import java.util.*;
public class Solution {

    public static int firstPosition(ArrayList<Integer> arr, int n, int k){
        int l = 0, r = n - 1;
        int ans = -1;

        while(l <= r){
            int mid = l +(r - l) / 2;
            if(arr.get(mid) < k){ 
               l = mid + 1;
                }
            else if(arr.get(mid) > k) {
                r = mid - 1;
            }
            else{
                r = mid - 1;
                ans = mid;
                }
        }

        return ans;
    }

     public static int lastPosition(ArrayList<Integer> arr, int n, int k){
        int l = 0, r = n - 1;
        int ans = -1;

        while(l <= r){
            int mid = l +(r - l) / 2;
            if(arr.get(mid) < k){ 
               l = mid + 1;
                }
            else if(arr.get(mid) > k) {
                r = mid - 1;
            }
            else{
                l = mid + 1;
                ans = mid;
                }
        }

        return ans;
    }



    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int ans[] = new int[2];
        ans[0] = firstPosition(arr, n, k);
        ans[1] = lastPosition(arr, n, k);
        return ans;
    }

};
