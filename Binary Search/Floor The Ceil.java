import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
      int ans[] = new int[2];

      // Tricky Question keep in mind to use the extra varaible for easyness
      
      int l = 0, r = n - 1, f = -1;

      while(l <= r){
        int mid = l + (r - l) / 2;
        if(arr[mid] <= x){
            l = mid + 1; 
            f = mid;
        } 
        else {
          r = mid - 1;
        }
      }

      if(f == -1 )ans[0] = -1;
      else ans[0] = arr[f];


      l = 0; r = n - 1; f = -1;

      while(l <= r){
        int mid = l +(r - l) / 2;
        if(arr[mid] < x){l = mid + 1;}
        else{ r = mid - 1;  f = mid;}
      }

     if(f == -1 )ans[1] = -1;
      else ans[1] = arr[f];

      return ans;
    }
    
}
