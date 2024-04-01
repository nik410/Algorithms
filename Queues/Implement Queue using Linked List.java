/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        QueueNode enqueue = new QueueNode(a);
        if(front == null){
            front = enqueue;
            rear = enqueue;
        }
        else{
            rear.next = enqueue;
            rear = rear.next;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        if(front != null){
            int ans = front.data;
            front = front.next;
            return ans;
        }
        else{
            return -1;
        }
	}
}
