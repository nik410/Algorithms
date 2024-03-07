/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        
        //If the element is to be inserted in the first position that is the head itself
        
        if(key <= head1.data){
            Node insert = new Node(key);
            insert.next = head1;
            head1 = insert;
            return head1;
        }
        
        Node temp = head1;
        
        while(temp.next != null){
            if(temp.next.data <= key){
                temp = temp.next;
            }
            else{
                break;
            }
        }
        
        Node inser = new Node(key);
        inser.next = temp.next;
        temp.next = inser;
        
        
        return head1;
        
        
    }
}
