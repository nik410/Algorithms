
class Solution{
    
    public void heapify(int index, int arr[], int n){
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        
        int largest = index;
        
        if(leftChild < n && arr[leftChild] > arr[largest]){
            largest = leftChild;
        }
        if(rightChild < n && arr[rightChild] > arr[largest]){
            largest = rightChild;
        }
        
        if(largest != index){
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            heapify(largest, arr, n);
        }
        
    }
    
    public void buildMaxHeap(int arr[], int n){
        for(int i = n/2 - 1; i >= 0; i--){
            heapify(i, arr, n);
        }
    }
    
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int arr[] = new int[a.length + b.length];
        int in = 0;
        for(int i: a){
            arr[in] = i;
            in++;
        }
        
        for(int i: b){
            arr[in] = i;
            in++;
        }
        // System.out.print("New:");
        // for(int i: arr){
        //     System.out.print(i +" ");
        // }
        
        buildMaxHeap(arr, arr.length);
        
        return arr;
        
    }
}
