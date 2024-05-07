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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode nextPo = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextPo;
        }

        int carry = 0;

        ListNode newCurr = prev;
        ListNode lastNode = null;
        while(newCurr != null){
            
            int nodeData = newCurr.val;

            int mulData = nodeData * 2;           

            newCurr.val = (mulData + carry) % 10;

            carry = mulData  / 10;

            lastNode = newCurr;
            newCurr = newCurr.next;

        }

        if(carry != 0){
            ListNode newNodeAdd = new ListNode(carry);
            lastNode.next = newNodeAdd;            
        }

        //Reveres the ll to get the answer


        ListNode revCurr = prev;
        ListNode revPrev = null;

        while(revCurr != null){
            ListNode revNext = revCurr.next;
            
            revCurr.next = revPrev;
            revPrev = revCurr;
            revCurr = revNext;

        }
        
        return revPrev;



    }
}
