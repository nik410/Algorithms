public class Solution {
    public static int searchInsert(int [] arr, int m){
       
       int l = 0, r = arr.length - 1;

       while(l <= r){
           int mid = l +(r - l) / 2;
        
             if(arr[mid] < m){
                l = mid + 1;
            }

            else if(arr[mid] >=m){
                r = mid - 1;
            }
       }

       return l;
    }
}
