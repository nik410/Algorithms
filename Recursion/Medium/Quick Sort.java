
class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p -1);
            quickSort(arr, p + 1, high);
            
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pos = low;
        
        for(int i = low; i <= high; i++){
            
            if(arr[i] <= arr[high]){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
        
        return pos - 1;
    } 
}
