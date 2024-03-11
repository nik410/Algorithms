
/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	    if(k == 1)return null;
	    
	    int counter = 0;
	    
	    Node p1 = head;
	    
	    while(p1 != null){
	        ++counter;
	        
	        if(counter % (k - 1) == 0){
	            if(p1.next == null)p1.next = null;
	            else
	            p1.next = p1.next.next;
	        }
	        
	        p1 = p1.next;
	    }
	    
	    
	    return head;
	    
	    
	    
    }
}
