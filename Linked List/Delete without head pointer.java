/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {

      //Unique Question think of it by drawing and you can see two case when del node is on last and otherwise
        Node toDel = del;
        if(del.next == null){
            del = null;
        }
        else{
        int val = del.next.data;
        
       toDel.data = val;
       toDel.next =toDel.next.next; 
       
        }
    }
}
