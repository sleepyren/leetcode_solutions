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
    public void reorderList(ListNode head) {
        ListNode slow = head; ListNode fast = head.next;
        
        //use fast and slow pointer to find the midpoint of the linkedList so we can split in two

        if (slow.next==null) return;
        while (fast != null && fast.next != null)
        {
            slow = slow.next; fast = fast.next.next;
        }
        //one after mid
        //initialize list and reverse it --> THE NEXT IS THE PREVIOUS THE NEXT IS THE PREVIOUS
        ListNode secondHalf = slow.next;
        slow.next = null; slow = secondHalf.next;
        secondHalf.next = null;
        

        while (slow != null)
        {
            ListNode prev = slow; slow = slow.next;
            prev.next = secondHalf; secondHalf = prev;
        }

        //finally combine the ordered half with the reversed half
        ListNode current = head.next;
        ListNode newList = head; newList.next = secondHalf;
        secondHalf = secondHalf.next; newList = newList.next;
        while (current != null)
        {
            newList.next = current; current = current.next;
            newList = newList.next;
            if (secondHalf!= null)
            {
            newList.next = secondHalf; secondHalf = secondHalf.next;
            newList = newList.next;
            }
        }
    }
}
//reorder_list medium O(N)
