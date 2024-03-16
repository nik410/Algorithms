/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         Node temp1 = head1;
         Node temp2 = head2;
         
         while(temp1 != temp2){
             if(temp1 != null){
                 temp1 = temp1.next;
             }
             else {
                 temp1 = head2;
             }
             
             
             if(temp2 != null){
                 temp2 = temp2.next;
             }
             else {
                 temp2 = head1;
             }
            if(temp1 == temp2 && temp1 !=null){
                 return temp1.data;
                 }
            if(temp1 == temp2 && temp1 == null) {
                return -1;
            }     
             
             
             
         }
         
             return temp1.data;
         
	}
}


