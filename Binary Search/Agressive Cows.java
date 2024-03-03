import java.util.*;
public class Solution {

    public static int howManyCowsCanComeInDistanceD(int []stalls, int mid){
        int cowCount = 1;
        int previousCowCoordinate = stalls[0];

        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - previousCowCoordinate >= mid){
                previousCowCoordinate = stalls[i];
                cowCount++;
            }
        }

        return cowCount;

    }
    public static int aggressiveCows(int []stalls, int k) {
        // The stalls cordinate aray can be sorted as the order in which input is given doesnot matter
        
        Arrays.sort(stalls);
    
        // This is observational part which can be get when we consider edge cases like what if only 2 cows are there
        // or what if coordinates are adjacent and cows are equal too n
        int l = 1, r = stalls[stalls.length - 1] - stalls[0];

        while(l <= r){
            int mid = l + (r - l) / 2;
            if(howManyCowsCanComeInDistanceD(stalls, mid) == k){
                
                l = mid + 1;
            }
            else if(howManyCowsCanComeInDistanceD(stalls, mid) < k){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

      // The return of r is important here as the solution space here is 1 1 1 1 1 0 0 0 0 0 so in the end the r pointer is on last 1 index
 
        return r;
    }
}
