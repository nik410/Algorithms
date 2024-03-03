import java.util.ArrayList;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int l = 0, r  = 0, ans = -1;

        for(int i: boards){
            l = Math.max(i, l);
            r += i;
        } 

        while(l <= r){
            int mid = l + (r - l) / 2;

            int count = 1, sum = 0;

            for(int i: boards){
                if(sum + i <= mid){
                    sum += i;
                }
                else{
                    count++;
                    sum = i;
                }
            }

            if(count <= k){
                ans = mid;
                r = mid - 1;
            }
            else if(count > k){
                l = mid + 1;
            }
        }

        return l;
    }
}
