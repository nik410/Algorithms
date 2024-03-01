import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
       int n = arr.size();
       if(arr.size() == 1){
           return 0;
       }
       if(arr.get(0) > arr.get(1)){
           return 0;
       }
        if(arr.get(n - 1) > arr.get(n - 2)){
           return n - 1;
       }

       int l = 1, r = n - 2;

       while(l <= r){
           int mid = l +(r - l) / 2;

           if(arr.get(mid) > arr.get(mid - 1) && arr.get(mid) > arr.get(mid + 1))return mid;

           if(arr.get(mid) < arr.get(mid + 1)){
               l = mid + 1;
           }
           else if(arr.get(mid) > arr.get(mid + 1)){
               r = mid - 1;
           }
           else{
               l = mid + 1;
           }
       }
       return -1;
    }
};
