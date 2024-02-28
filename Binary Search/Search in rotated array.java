import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {       
        int l = 0, r = n - 1;

        while(l <= r){
            int mid = l +(r - l) / 2;
            if(arr.get(mid) == k)return mid;
            // Right Sorted 
            if(arr.get(mid) <= arr.get(r)){
                    if(arr.get(r) >= k && arr.get(mid) <= k){
                        l = mid + 1;
                    }
                    else{
                        r = mid - 1;                        
                    }
            }            
            //Left Sorted
            else if(arr.get(l) <= arr.get(mid)){
                if(arr.get(l) <= k && k <= arr.get(mid)){
                    r = mid - 1;
                }
                else l = mid + 1;
            }
        }
        return -1;
    }
}
