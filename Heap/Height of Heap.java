
class Solution{
    static int heapHeight(int N, int arr[]){
        int heapHei = 0;
        
        while(N > 0){
            heapHei++;
            N /= 2;
        }
        
        return heapHei - 1;
    }
}
