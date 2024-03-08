/*
class Node
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

class GfG
{
    public static int nknode(Node head, int k)
    {

    // Naive Approach TC :- O(n) + O(n)
    //   Node temp = head;
    //   int nodeC = 0;
       
    //   while(temp != null){
    //       temp = temp.next;
    //       nodeC++;
    //   }
       
    //   int index = (int)(Math.ceil((double)nodeC/k)), c = 1;
      
    //   int ans = -1;
    //   temp = head;
    //   while(c != index){
    //       temp = temp.next;
    //       c++;
    //   }
    //   ans = temp.data;
       
    //   return ans;
    
    
    //Optimal Approach
    
    Node temp1 = head.next;
    Node answer = head;
    int i = 1;
    
    while(temp1 != null){
       
        if(i % k == 0){
            answer = answer.next;
        }
         i++;
        temp1 = temp1.next;
         
    }
   
    return answer.data;
       }
}
