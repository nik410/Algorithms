import java.util.ArrayList;

public class Solution {

    public static int divPossible(ArrayList<Integer> arr, int mid){
        int people = 1;
        int sumPages = 0;

        for(int i: arr){
            if(sumPages + i <= mid){
                sumPages += i;
            }
            else{
                people++;
                sumPages = i;
            }
        }

        return people;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int l = 0, r = 0, ans = -1;

        if(m > n)return -1;
        
        for(int i: arr){
            l = Math.max(l, i);
            r += i;
        }

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(divPossible(arr, mid) == m){
                ans = mid;
                r = mid - 1;
            }
            else if(divPossible(arr, mid) > m){
                l = mid + 1;
            }
            else{
                
                r = mid -1;
            }           

        }
        return l;
    }
}
