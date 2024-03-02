import java.util.*;

public class Solution {

    public static int divValue(int arr[], int mid){
        double ans = 0;
        for(int i: arr){
            ans += Math.ceil((double)(i)/mid);

        }
        return (int)ans;

    }
    public static int smallestDivisor(int arr[], int limit) {
        
        int maxElementInArray = -1;

        for(int i: arr){
            maxElementInArray = Math.max(maxElementInArray, i);
        }
        

        int l = 1, r = maxElementInArray, ans = 0;

        while(l <= r){
            int mid = l + (r - l) / 2;
            if(divValue(arr, mid) <= limit){                
               
                r = mid - 1;
            }
            else if(divValue(arr, mid) > limit){     
                         
                l = mid + 1;
            }
        }

      // Remember to  return l as in this we can see that the solution space will we of pattern 1 1 1 1 1 0 0 0 0 where 1 is possible answers and 0 is non possiple answers

        return l;
    }
}
