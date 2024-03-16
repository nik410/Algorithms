/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node zeros = new Node(0);
        Node start = zeros;
        Node ones = new Node(1);
        Node startOne = ones;
        Node twos = new Node(2);
        Node startTwo = twos;
        
        Node temp = head;
         
        while(temp != null){
            if(temp.data == 0){
                Node nextP = temp.next;
                zeros.next = temp;
                temp.next = null;
                temp = nextP;
                zeros = zeros.next;
            }
            
            else if(temp.data == 1){
                Node nextP = temp.next;
                ones.next = temp;
                temp.next = null;
                temp = nextP;
                ones = ones.next;
            }
            
            else if(temp.data == 2){
                Node nextP = temp.next;
                twos.next = temp;
                temp.next = null;
                temp = nextP;
                twos = twos.next;
            }
        }
        
        if(startOne.next != null ){
        zeros.next = startOne.next;
        ones.next = startTwo.next;
        }
        if(startOne.next == null){
             zeros.next = startTwo.next;
        }
        
        if(start.next != null)
        return start.next;
        
        else if(startOne.next != null)
        return startOne.next;
        else return startTwo.next;
        
    }
}
