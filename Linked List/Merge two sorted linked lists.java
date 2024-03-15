/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
      Node tail = new Node(-1);
      Node start = tail;
      
      while(head1 != null && head2 != null){
          if(head1.data <= head2.data){
              tail.next = head1;
              head1 = head1.next;
              tail = tail.next;
              tail.next = null;
          }
          else{
               tail.next = head2;
              head2 = head2.next;
              tail = tail.next;
              tail.next = null;
          }
      }
      
    if(head1 != null)tail.next = head1;
    if(head2 != null)tail.next = head2;
       
      return start.next;
      
   } 
}
