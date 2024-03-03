import java.util.* ;
import java.io.*; 
public class Solution {

    public static int daysNeed(int arr[], int mid){
        int needDays = 1;
        int sum = 0;
        for(int i: arr){
           if(sum + i <= mid){
               sum += i;
           }
           else{
               needDays++;
               sum = i;
           }
        }           
        //System.out.println(""+"Mid: "+ mid+" Days: " + needDays);
        return needDays;
    }
    public static int leastWeightCapacity(int[] weights, int d) {
        
        int minValueOfWeightThatHasToBeToTransport = 1, sum = 0;

        for(int i: weights){
            minValueOfWeightThatHasToBeToTransport = Math.max(minValueOfWeightThatHasToBeToTransport, i);
            sum += i;
        }

        int l = minValueOfWeightThatHasToBeToTransport, r = sum;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(daysNeed(weights, mid) > d){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return l;
    }
}
