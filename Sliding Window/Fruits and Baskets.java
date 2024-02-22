public class Solution {
    public static int findMaxFruits(int []arr, int n) {
         int l = 0, r = 0, maxAns = 0, k = 2;

        int freq[] = new int[n + 1];
        int distinctCount = 0, sum = 0;
        
        while( r < n){

                sum += 1;

             while(distinctCount > k && l < r){
                sum -= 1;
                -- freq[arr[l]];
                if(freq[arr[l]] == 0){
                    distinctCount --;
                }
                l++;
            }

            
            ++freq[arr[r]];
            if(freq[arr[r]] == 1){
                distinctCount++;
            }

           

            if(distinctCount <=k ){
                maxAns = Math.max(maxAns, sum);
            }
            r++;



        }
        return maxAns; 
    }
    
}
