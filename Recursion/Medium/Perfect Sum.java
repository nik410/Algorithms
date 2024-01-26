class Solution{

    public static int count(int arr[], int index, int target){
        if(index == arr.length){
            if(target == 0)return 1;
            return 0;
        }
        
        int takeEle = count(arr, index + 1, target - arr[index]);
        
        int notTakeEle = count(arr, index + 1, target);
        
        return takeEle + notTakeEle;
    }

	public int perfectSum(int arr[],int n, int sum) 
	{ 
    //Wil give TLE use DP approach
	   return count(arr, 0, sum);
	} 
}
