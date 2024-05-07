/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
    
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    
    // public static Node merge(Node head1, Node head2){
    //     Node tail = new Node(-1);
    //     Node newHead = tail;
        
    //     while(head1 != null && head2 != null){
    //         if(head1.data <= head2.data){
    //             tail.next = head1;
    //             head1 = head1.next;
    //             tail = tail.next;
    //             tail.next = null;
    //         }
    //         else{
    //             tail.next = head1;
    //             head2 = head2.next;
    //             tail = tail.next;
    //             tail.next = null;
    //         }
    //     }
        
    //     if(head1 != null){
    //         tail.next = head1;
    //     }
    //     else if(head2 != null){
    //         tail.next = head2;
    //     }
        
    //     return newHead.next;
        
    // }
    
    // public static void mergeSort(Node arr[], int start, int end){
    //     if(start >= end ){return;}
    //         int mid = start + (end - start) / 2;
    //         mergeSort(arr, start, mid);
    //         mergeSort(arr, mid + 1, end);
            
    //       arr[start] = merge(arr[start], arr[mid + 1]);
        
        
        
    // }
    
    
    
    
    class myComparator implements Comparator<Node>{
        public int compare(Node n1, Node n2){
            return n1.data - n2.data;
        }
    }
    
    //Function to merge K sorted linked list.
    Node mergeKList(Node[] arr,int K){
    // {   if(K == 0)return null;
    //     if(K == 1) return arr[0];
    
    //   Node head1 = arr[0];
    //   for(int i = 1; i < K; i++){
    //       Node head2 = arr[i];
    //       head1 = merge(head1, head2);
    //   }
    
    //   mergeSort(arr, 0, K - 1);
       
    //   return arr[0];
    
    PriorityQueue<Node> pq = new PriorityQueue(K, new myComparator());
    
    for(int i = 0; i < arr.length; i++){
        pq.add(arr[i]);
    }
    
    Node head = pq.remove();
    Node curr = head;
    if(head.next != null){
        pq.add(head.next);
    }
    
    while(pq.size() > 0){
        Node temp = pq.remove();
        
        //
        
        curr.next = temp;
        curr = temp;
    
        if(temp.next != null){
            pq.add(temp.next);
         }
    }
    
    
    return head;
 }
} 
