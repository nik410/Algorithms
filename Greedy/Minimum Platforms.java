class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int ans = 0;
        int c = 0;
        
        int i = 0, j = 0;
        
        while(i < n){
            if(arr[i] < dep[j]){
                c ++;
                ans = Math.max(c, ans);
                i ++;
            }
            else{
                c --;
                j ++;
            }
        }
        
        return ans;
        
        // Prefix Sum Concept 
        
        // int maxP = 2500;
        // int[] rangeSums = new int[maxP];
        // int sol = 0;
        // for(int i = 0; i < n; i++){
        //     rangeSums[arr[i]]++;
        //     rangeSums[dep[i]+1]--;
        // }
        // for(int i = 1; i < maxP; i++){
        //     rangeSums[i] += rangeSums[i-1];
        //     sol = Math.max(sol, rangeSums[i]);
        // }
        // return sol;
    }
    
}

