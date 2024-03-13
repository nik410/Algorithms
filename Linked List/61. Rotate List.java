/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null )return head;
       

        ListNode p1 = head;
        
        int length = 0;

        while(p1 != null){
            p1 = p1.next;
            length++;
        }

        int rotatePoint = length - (k % length);
        
        if(k % length == 0)return head;

        ListNode temp = head;
        int c  = 1;
        while(c != rotatePoint){
            temp = temp.next;
            c++;
        }

        ListNode newSt = temp;

        while(newSt.next != null){
            newSt = newSt.next;
        }

        ListNode startNew = temp.next;
        newSt.next = head;
        temp.next = null;

        

        return startNew;  
    }
}
