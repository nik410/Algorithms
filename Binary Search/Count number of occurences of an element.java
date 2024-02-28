public class Solution {

    public static int firstOcc(int arr[], int x){
        int l = 0, r = arr.length - 1;
        int ans = -1;

        while(l <= r){
            int mid = l +(r - l) / 2;
            if(arr[mid] < x){
                l = mid + 1;
            }
            else if(arr[mid] > x){
                r = mid - 1;

            }
            else{
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }

     public static int lastOcc(int arr[], int x){
        int l = 0, r = arr.length - 1;
        int ans = -1;

        while(l <= r){
            int mid = l +(r - l) / 2;
            if(arr[mid] < x){
                l = mid + 1;
            }
            else if(arr[mid] > x){
                r = mid - 1;

            }
            else{
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int count(int arr[], int n, int x) {
        int firstIn = firstOcc(arr, x);
        int lastIn = lastOcc(arr, x);

        if(firstIn != - 1){
            return lastIn - firstIn + 1;
        }
         return 0;
    }
}
