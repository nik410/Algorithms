class MaxHeap{
	int arr[];
	int size;	//Total elements currently present at an instance
	int total_size;		//Total size of array
	
	public MaxHeap(int n) {
		arr = new int[n];
		total_size = n;
		size = 0;
	}
	
	//Insert into heap
	
	void insert(int val) {
		
		if(size == total_size) {
			System.out.println("Overflow");
			return;
		}
		
		arr[size] = val;
		
		int child = size;
		int parent = (child - 1)/2;
		while(arr[parent] < arr[child]) {
		
				int temp = arr[parent];
				arr[parent] = arr[child];
				arr[child] = temp; 
				
				child = parent;
				parent = (child - 1) / 2;			
		}		
		size++;		
	}
	
	void print() {
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	void Heapify(int index){
		int child1 = 2 * index + 1;
		int child2 = 2 * index + 2;
		int largest = index;
		if(child1 < size && arr[child1] > arr[index]) {
			largest = child1;
		}
		if(child2 < size && arr[child2] > arr[index]) {
			largest = child2;
		}
		
		if(largest != index) {
			int temp = arr[largest];
			arr[largest] = arr[index];
			arr[index] = arr[largest];
			Heapify(largest);
		}
	}
	
	void delete() {
		if(size == 0) {
			System.out.println("Heap Underflow ");
		}
		System.out.println(arr[0] +": Deleted from the Heap");
		arr[0] = arr[size - 1];
		size --;
		
		if(size == 0)return;
		
		Heapify(0);
		
	}
	
}

public class MaxHeapUsingStepUp {

	public static void main(String[] args) {
		MaxHeap m1 = new MaxHeap(6);
		m1.insert(4);
		m1.insert(14);
		m1.insert(11);
		//m1.insert(10);
		m1.print();
		m1.insert(114);
		m1.insert(24);
		m1.insert(1);
		m1.print();

	}

}
