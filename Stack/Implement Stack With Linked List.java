/****************************************************************

 Following is the class structure of the Node class:

 static class Node
 {
     int data;
     Node next;
     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };


 *****************************************************************/
public class Solution {
    static class Stack {
        //Write your code here
        Node st;
        int siz;
        Stack()
        {
           st = null;
           siz = 0;
        }

        int getSize()
        {
           return siz;
        }

        boolean isEmpty()
        {
           if(siz == 0)return true;
           else
                    return false;
        }

        void push(int data)
        {
           Node insert = new Node(data);
           insert.next = st;
           st = insert;
           siz++;
        }

        void pop()
        {
            if(st != null){           
          st = st.next;
          siz--;
          }
            
        }

        int getTop()
        {

            if(st == null)return -1;

            int ans = st.data;

            return ans;
        }
    }
}
