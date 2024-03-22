class GfG
{
    public static Node merge(Node head1, Node head2){
        Node tail = new Node(-1);
        Node newHead = tail;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tail.bottom = head1;
                head1 = head1.bottom;
                tail = tail.bottom;
                tail.bottom = null;
            }
            else{
                tail.bottom = head2;
                head2 = head2.bottom;
                
                tail = tail.bottom;
                tail.bottom = null;
            }
        }
        
        if(head1 != null){
            tail.bottom = head1;
        }
        else{
             tail.bottom = head2;
        }
        
        Node temp = newHead.bottom;
        
        // while(temp != null){
        //     System.out.println(temp.data + "Yo");
        //     temp = temp.bottom;
        // }
        
        
         
        return newHead.bottom;
    }
    
    Node flatten(Node root)
    {
	    Node head1 = root, head2 = root.next;
	    
	    while(head2 != null){
	        
	       // head1 = root;
	       // head2 = root.next;
	        Node head3 = head2.next;
	        
	        head1.next = null;
	        head2.next = null;
	        
	        Node mergedHead = merge(head1, head2);
	       
	        head1 = mergedHead;
	        head2 = head3;
	       // if(head1 == root)start = merged;
	          
	       // return merged;
	       // root = merged;
	        
	    }
	    
	    return head1;
    }
}
