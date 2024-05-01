
import java.util.Random;

public class HeapSort {
	
	static void heapify(int arr[], int index, int n) {
		int largest = index;
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		
		if(leftChild < n && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}
		
		if(rightChild < n && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}
		
		if(largest != index) {
			int temp = arr[largest];
			arr[largest] = arr[index];
			arr[index] = temp;
			heapify(arr, largest, n);
		}
		
	}
	
	
	public static void heapSort(int arr[], int n) {
		
		for(int i = n - 1; i > 0; i --) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, 0, i);
		}
	}
	
	public static void maxHeap(int arr[], int n) {
		for(int i = n/2 - 1; i >= 0; i--) {
			heapify(arr, i, n);
		}
	}
	

	static void print(int arr[]) {
		System.out.print("Sorted Array: ");
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Random rand = new Random();
		
		int n = rand.nextInt(20);
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.print("Original Array: ");
		for(int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println();
		maxHeap(arr, n);

    //Time Complexcity is O(nlogn)
    //Space Complexity when recursive function is used to heapify O(log n), if iterative used O(1)
		
		heapSort(arr, n);
		System.out.println("After: ");
		print(arr);

	}

}
