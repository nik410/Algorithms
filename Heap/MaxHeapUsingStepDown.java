package Arrays;

public class MaxHeapUsingStepDown {

	public static void Heapify(int index, int arr[]) {
		int largest = index;
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		
		if(leftChild < arr.length && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}
		
		if(rightChild < arr.length && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}
		
		if(largest != index) {
			int temp = arr[largest];
			arr[largest] = arr[index];
			arr[index] = temp;
			Heapify(largest, arr);
		}
		
	}
	
	public static void BuildMaxHeap(int arr[], int n){
		
		for(int i = n/2 - 1; i >=0; i--) {
			Heapify(i, arr);
		}
	}
	
	public static void print(int arr[]) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 3, 8, 9, 5, 13, 18, 14, 11, 70};
		
		// The time complexity for building this heap is O(n) 
		// The Space complexity is log(n) in worst case 
		
		BuildMaxHeap(arr, arr.length);
		print(arr);

	}

}
