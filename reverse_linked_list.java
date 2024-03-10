class Solution {
    public ListNode reverseList(ListNode head) {
    if (head == null) return null;

   // ListNode temphead = new ListNode(head.val);
    ListNode temphead = new ListNode(head.val);
    //temp = head; 
    head = head.next;
    while (head != null)
    {
        ListNode temp = new ListNode(head.val);
        temp.next = temphead;
        //temp = new ListNode(head.next.val);
        temphead = temp;
        head = head.next;
        //temp = temp.next;
    }
    
    return temphead;

    }
}
//reverse_linked_list easy O(N)
