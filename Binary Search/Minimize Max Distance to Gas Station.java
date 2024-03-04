public class Solution {

    public static int count(int arr[], double mid){
        int countNew = 0;
            for(int i = 0; i < arr.length - 1; i++){
            if((arr[i+ 1] - arr[i]) == (mid * (int)((arr[i+ 1] - arr[i])/mid))){
                countNew += (arr[i+ 1] - arr[i])/ mid - 1;
            }
            else{
                countNew += (arr[i+ 1] - arr[i])/ mid;
            }
         }
         return countNew;
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        double l = 0, r = 0;
         for(int i = 0; i < arr.length - 1; i++){
            r = Math.max(r, arr[i + 1] - arr[i]);
        }

        double diff = 1e-6;
        while(r - l > diff){
            double mid = (l + r) / 2.0;          

            if(count(arr, mid) > K){
                l = mid;
            }
            else{
                r = mid;
            }

        }

        return r;
    }
}
