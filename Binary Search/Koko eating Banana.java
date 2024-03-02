import java.util.Arrays;
public class Solution {


    public static int hourTaken(int []v, long mid, int h){
        long hoursTaken = 0;

        for(int i = 0; i < v.length; i++){
            hoursTaken += v[i]/mid;
            if(v[i] % mid != 0){
                hoursTaken ++;
            }
        }

        if(hoursTaken == h)return 0;
        else if(hoursTaken < h)return -1;
        else return 1;
    }
    public static int minimumRateToEatBananas(int []v, int h) {
        
        if(v.length == 1){
            if(v[0] % h ==0)
                return (int)v[0]/h;            
            else
                 return (int)v[0]/h + 1; 
            }
        Arrays.sort(v);
        long l = 1, r = v[v.length - 1], ans = 0;
        while(l <=  r){
            long mid = l + (r - l) / 2;

            
             if(hourTaken(v, mid, h) == -1 || hourTaken(v, mid, h) == 0){
                 ans = mid;
                r = mid -1;
            }
            else{
               
                l = mid + 1;
            }
        }

        return (int)ans;
    }
}



