import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //XOR Method
        // int xorr = 0;
        // for(int i: arr){
        //     xorr = (xorr ^ i);
        // }

        // return xorr;


        //Using Binary Search Algorithm.
        //The key observation is that we can tell the element repeataion is on its right 
        //side or left side based on the mid is even or odd

        int l = 0, r = arr.size() - 1, n = arr.size();

        if(arr.size() == 1)return arr.get(0);

        if(!arr.get(0).equals(arr.get(1)))return arr.get(0);
        if(!arr.get(n - 1).equals(arr.get(n - 2)))return arr.get( n - 1);

        l = 1; r = n - 2;

        while(l <= r){
            int mid =  l + (r - l) / 2;
            if(!arr.get(mid).equals(arr.get(mid - 1)) && !arr.get(mid).equals(arr.get(mid + 1))){
                return arr.get(mid);
            }

            if(mid % 2 == 0){
                if(!arr.get(mid).equals(arr.get(mid + 1))){
                    r = mid - 1;
                }
                else if(arr.get(mid).equals(arr.get(mid + 1))){
                    l = mid + 1;
                }
            }

            if(mid % 2 == 1){
                if(!arr.get(mid).equals(arr.get(mid - 1))){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
        }

        return -1;
    }
}
