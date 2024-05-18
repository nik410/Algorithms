class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        
        int diff = arr[n - 1] - arr[0];
        
        int largest = arr[n - 1];
        int smallest = arr[0];      
        
        for(int i = 0; i < n - 1; i ++){
            largest = Math.max(arr[i] + k, arr[n - 1] - k);
            smallest = Math.min(arr[i + 1] - k, arr[0] + k);
            
            diff = Math.min(diff, largest - smallest);
        }
        
        return diff;
        
    }
}
