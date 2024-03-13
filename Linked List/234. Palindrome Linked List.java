/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *    ListNode next;
 *    ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //The first that is striking my mind is to use a separate array or string and store the 
        //values and then check but it takes more time and space

        //One Thing we can do is to combine two concept ie of tortoise hare and reverse a linked list 
        //and then solver it
        if(head.next == null)return true;
        ListNode slow = head;
        ListNode fast = head;
        int l = 0;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next; 
            l++;       
        }

        if(fast.next == null){
            l *=2;
            l++;
        }
        else{
            l *= 2;
        }
        //  System.out.println("Slow: " + slow.val);
        ListNode secondLlHead = slow.next;

        //Breaking the link between the middle and middle + 1 ListNode to create a new LL of about half size
        slow.next = null;

    //     ListNode r = head;
    //    while(r.next != null){
    //      System.out.println("Value: " + r.val);
    //      r = r.next;
    //    }

        //Now we have to reverse any of the two linked list we just created

        ListNode curr = head;
        ListNode prev = null;
        ListNode nextP = null;

        while(curr != null){
            nextP = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextP;
        }
    //    ListNode r = prev;
    //    while(r != null){
    //      System.out.println("Value: " + r.val);
    //      r = r.next;
    //    }
        //The next is the new head of the the reversed list

        //Now comparing
        //Keeping the odd length cjecj to ignore the middle part

        if(l % 2 == 1)prev = prev.next;

        while(prev != null && secondLlHead != null){

            if(prev.val != secondLlHead.val) return false;
            prev = prev.next;
            secondLlHead = secondLlHead.next;
        }

        if(prev == null && secondLlHead == null)return true;
        
        else return false;
    }
}
