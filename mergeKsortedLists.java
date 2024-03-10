class Solution {

    class Comp implements Comparator<ListNode>{
        public int compare(ListNode n1, ListNode n2)
        {
            if (n1.val > n2.val) return 1;
            else if (n2.val > n1.val) return -1;
            else return 0;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) return null;
        PriorityQueue<ListNode> minQ = new PriorityQueue<>(new Comp());
        
        ListNode head = new ListNode();
        ListNode curr = head;
        
        for (int i = 0; i < lists.length; i++)
            {
            if (lists[i]==null) continue;
            minQ.add(lists[i]);
            System.out.println(lists[i].val);
            }
        


        while (minQ.peek() != null)
        {
            ListNode node = minQ.poll();
            curr.next = new ListNode(node.val);
            curr = curr.next;
            node = node.next;

            if (node == null) continue;
            else minQ.add(node);    
        }

    return head.next;

    }
}
//mergeKSortedLists hard O(N*logK)
