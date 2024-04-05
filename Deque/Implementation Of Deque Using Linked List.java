package Arrays;


class Node<T extends Object>{
	T data;
	Node next;
	Node prev;
	
	Node(T data){
		this.data = data;
		next = prev = null;
	}
	
}

public class DequeImplementationUsingLinkedList<T extends Object> {
	
	Node front, rear;
	
	public DequeImplementationUsingLinkedList() {
		front = rear = null;
	}
	
	void push_front(T x) {
		if(front == null) {
			front = rear = new Node(x);
			return;
		}
		else {
				Node tempNode = new Node(x);
				tempNode.next = front;
				front.prev = tempNode;
				front = tempNode;
				return;				
			
		}
	}
	
	void push_back(T x) {
		if(front == null) {
			front = rear = new Node(x);
		
			return;
		}
		else {
				Node tempNode = new Node(x);
				tempNode.prev = rear;
				rear.next = tempNode;
				rear = tempNode;
				return;				
			
		}
	}
	
	void pop_front() {
		if(front == null) {
			
			System.out.println("Deque Underflow!!");
			return;
		}
		else {
			Node tempNode = front;
			System.out.println("Popped Val: "+ tempNode.data +" from front");
			front = front.next;
			tempNode.next = null;
			if(front != null) {
			front.prev = null;
			
			}
			else {
				rear = null;
			}
			
			
		}
	}
	
	void pop_back() {
		if(front == null) {
			System.out.println("Deque Underflow!!");
			return;
		}
		else {
			Node tempNode = rear;
			System.out.println("Popped Val: "+ tempNode.data +" from back");
			rear = tempNode.prev;
			
			tempNode.prev = null;
			
			if(rear != null) {
				rear.next = null;
			}
			else {
				front = null;
			}	
		}
	}
	
	Object start() {
		if(front == null)return -1;
		else {
			return front.data;
		}
	}
	
	Object end() {
		if(front == null)return -1;
		else {
			return rear.data;
		}
	}

	public static void main(String[] args) {
//		DequeImplementationUsingLinkedList<Double> d = new DequeImplementationUsingLinkedList();
//		d.push_back(5.9);
//		d.push_back(18.7);
//		d.pop_back();
//		System.out.println(d.start());
//		System.out.println(d.end());
//		d.pop_back();
//		d.pop_back();
//		d.push_back(18.6);
//		d.push_back(18.9);
//		d.push_back(1d);
//		System.out.println(d.start());
//		d.pop_front();
//		System.out.println(d.start());
//		
		DequeImplementationUsingLinkedList<String> d = new DequeImplementationUsingLinkedList();
		d.push_back("Hi");
		d.push_back("ello");
		System.out.println(d.start());
		System.out.println(d.end());
		d.pop_back();
		System.out.println(d.start());
		
		

	}

}
