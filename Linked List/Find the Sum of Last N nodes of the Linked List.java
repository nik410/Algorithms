/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      Node temp1 = head;
      Node temp2 = head;
      
      int size = 0, sum = 0;
      
      while(temp1 != null){
          sum += temp1.data;
          size++;
          
          if(size > k){
              sum -= temp2.data;
              temp2 = temp2.next;
          }
          temp1 = temp1.next;
      }
      
      return sum;
    }
}
