
class Solution{
    static int minJumps(int[] arr){
        int farthest = 0;
        int end = 0;
        int steps = 0;
        
        for(int i = 0; i < arr.length - 1; i ++){
            farthest = Math.max(farthest, arr[i] + i);
            
            if(i == end){
                end = farthest;
                steps++;
            }
        }
        
        if(end < arr.length - 1)return -1;
        
        return steps;
    }
}
