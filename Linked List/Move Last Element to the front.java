/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
        
      // Remember to use pen and paper for lower limits of contrainst and then for odd length and even length condition
      
      if(head.next == null)return head;

      
       Node pointLast = head;
       
       while(pointLast.next.next != null){
           pointLast = pointLast.next;
       }
       
         Node last = pointLast.next;
       //System.out.println(pointLast.data);
        pointLast.next = null;
        
        last.next = head;
        head = last;
        
        return head;
        
       
    }
}
      
