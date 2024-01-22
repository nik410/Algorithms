
public class Main
{
    
    public static void recBubbleSort(int arr[], int n){
        if(n == 0){
            return;
        }
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
	                int temp = arr[i];
	                arr[i] = arr[i + 1];
	                arr[i + 1] = temp;
	                count++;
	            }
        }
        // This count helps in determing if the remaining elements are in sorted sequence or not
         
        if(count == 0)return;
        
        recBubbleSort(arr, n - 1);
        
        
    }
    
	public static void main(String[] args) {
	   // Iterative 
	   
	   
	    int arr[] = {6, 7, 24, 1, 34};
	    int n = arr.length;
	   // for(int i = 0; i < n - 1; i++){
	   //     for(int j = 0; j < n - i - 1; j++){
	   //         if(arr[j] > arr[j + 1]){
	   //             int temp = arr[j];
	   //             arr[j] = arr[j + 1];
	   //             arr[j + 1] = temp;
	   //         }
	   //     }
	        
	   //     for(int k : arr){
	   //         System.out.print(k+" ");
	   //     }
	   //     System.out.println();
	   // }
	   
	   
	   //Recursive 
	   
	   recBubbleSort(arr, n);
	   
	        for(int k : arr){
	            System.out.print(k+" ");
	        }
	        System.out.println();
	    
	   
	}
	
	
	
}
