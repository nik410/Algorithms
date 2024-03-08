/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    
    public void deleteAlternate (Node head){
        Node temp = head;
        // Whenever you have to figure out the conditions of loop dry run on an even and a odd length linked list in most cases
        while(temp !=null && temp.next != null){
           
            temp.next = temp.next.next;
            temp = temp.next;
        }
    
        
    }
    
}
