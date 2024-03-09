/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
      //Mathematical angle of the question is that if you move one pointer till the given n then the second and first pointer simultaneously second will point to answer
        
    	Node slow = head;
    	Node fast = head;
    	int c = 0; 
    	while(c != n){
    	    if(fast != null)
    	    fast = fast.next;
    	    else{
    	        return -1;
    	    }
    	    c++;
    	}
    	
    	while(fast != null){
    	    slow = slow.next;
    	    fast = fast.next;
    	}
    	
    	return slow.data;
    }
}
