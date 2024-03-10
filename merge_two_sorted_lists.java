    // O(N + M) time complexity solution where N and M are the lengths of list1 and list2
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
    //13 is a dummy value!!!
    ListNode temp = new ListNode(13);
    ListNode head = temp;

    while (list1 != null && list2 != null)
    {
        if (list1.val < list2.val)
        {
        temp.next = new ListNode(list1.val);
        temp = temp.next;
        list1 = list1.next;
        }
        else 
        {
        temp.next = new ListNode(list2.val);
        temp = temp.next;
        list2 = list2.next;
        }
    }
    if (list1 == null) temp.next = list2;
    if (list2 == null) temp.next = list1;
    //return the list AFTER THE DUMMY VAL ;)))
    return head.next;

    }
//merge_two_sorted_lists easy O(N)
