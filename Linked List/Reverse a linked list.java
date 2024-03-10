/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node nextN = null;
        
        while(curr != null){
            nextN = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextN;
            
        }
        
        return prev;
    }
}
