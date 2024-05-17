
class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum)
    {
        if(n * 9 < sum){
            return "-1";
        }
        else{
            String s ="";
            
            while(sum / 9 > 0){
                sum -= 9;
                s += "9";
                n--;
            }
            
            if(n > 0)
            s += sum;
            n--;
            
            while(n > 0){
                s += "0";
                n--;
            }
            
            return s;
        }
    }
}


