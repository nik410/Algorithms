public class Solution {
    public static int findKRotation(int []arr){
       int low = 0, high = arr.length - 1;
       int min = Integer.MAX_VALUE;
        int index = -1;

        //Usage of the minumum element concept as by finding the mini element posiition we can find the rotation count. 

      
       while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[low] <= arr[high]){
                if(arr[low] <= min){
                    min = arr[low];
                    index = low;
                }
                break;
            }

            if(arr[low] <= arr[mid]){
                 if(min > arr[mid]){
                    min = arr[low];                  
                    index = low;
                }
                  low = mid + 1;
            }

            else{
                 if(min > arr[mid]){
                    min = arr[mid];                    
                    index = mid;
                }
                high = mid - 1;
            }
            }


        return index;
       

    }
}
