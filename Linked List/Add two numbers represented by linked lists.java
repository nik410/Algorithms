/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
       //The first and foremost thing we have to do is
       // to reverse the linked list as we start the addition from least sognificant digit
       
       Node curr1 = first;
       Node prev1 = null;
       
       while(curr1 != null){
           Node nextPoin = curr1.next;
           curr1.next = prev1;
           
           prev1 = curr1;
           curr1 = nextPoin;
           
       }
       
       //Node prev1 point the start of reversed ll that is the last elment of ll
       
       
       
       Node curr2 = second;
       Node prev2 = null;
       
       while(curr2 != null){
           Node nextPoin = curr2.next;
           curr2.next = prev2;
           
           prev2 = curr2;
           curr2 = nextPoin;
           
       }
       
       //Node prev2 point the start of reversed ll that is the last elment of ll
      
       Node headAdd = new Node(-1);
       Node headAns = headAdd;
       int carry = 0;
       while(prev2 != null || prev1 != null){
           int val1 = 0, val2 = 0;
           
           if(prev1!= null){
               val1 = prev1.data;
           }
            if(prev2!= null){
               val2 = prev2.data;
           }
           
           int sum = val1 + val2 + carry;
           Node newDigit = new Node(sum % 10);
           headAdd.next = newDigit;
           headAdd = headAdd.next;
           carry = sum / 10;
          
           if(prev1!= null){
               prev1 = prev1.next;
           }
            if(prev2!= null){
               prev2 = prev2.next;
           }
       }
       
       if(carry != 0){
            Node newDigit = new Node(carry);
           headAdd.next = newDigit;
           headAdd = headAdd.next;
           
       }
       
       //As of Now we have got the reverse of the sum once we reverse it and answer
       //The questions objective is complete
       
       Node temp1 = headAns.next;
       Node prevAns = null;
       
       while(temp1 != null){
           Node nexPo = temp1.next;
           temp1.next = prevAns;
           
           prevAns = temp1;
           temp1 = nexPo;
       }
       
       
       
       return prevAns;
       
       
    }
}
