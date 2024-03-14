/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    Node curr = head;
	    Node nextNode = null;
	    
	    while(curr != null){
	        nextNode = curr.next;
	        if(nextNode != null && curr.data == nextNode.data){
	            
	            curr.next = curr.next.next;
	        }
	        else{
	            curr = curr.next;
	        }
	        
	    }
	    
	    return head;
    }
}
