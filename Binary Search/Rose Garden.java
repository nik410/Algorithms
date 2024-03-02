import java.util.Arrays;
public class Solution {


    public static int possibleBouquets(int arr[], int r, int b, int mid){
        int boqPoss = 0;
        int cnt = 0;
        
        // The use of cnt variable is important in maintaining the contiguous / consective count
  
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= mid){            
                cnt++;            
            }
            else{
                boqPoss += cnt/r;
                cnt = 0;
            }
        }
          boqPoss += cnt/r; 

        return boqPoss;
    }
    public static int roseGarden(int[] arr, int r, int b) {



       // Few Important Observations
      // First the number of rosees used in a bouquets ar in continguous / consecutive index, so we can not sort the array havong day of blossoming data
      // Second we can reduce the search space by making simple observation that the minimum day in any testcase can be minimum day of blossoming in the 
      // array and the same idea for maximum day
       
       int minInArray = Integer.MAX_VALUE;
       int maxInArray = Integer.MIN_VALUE;

       for(int i : arr){
           minInArray = Math.min(minInArray, i);

           maxInArray = Math.max(maxInArray, i);
       }



       int l = minInArray, r1 = maxInArray, ans = -1;
       
       while(l <= r1){
           int mid = l + (r1 - l) / 2;

           if(possibleBouquets(arr, r, b, mid) < b){
               l = mid + 1;
           }
           else{
                ans = mid;
                r1 = mid - 1;
           }
       }

       return ans;
    }
}
