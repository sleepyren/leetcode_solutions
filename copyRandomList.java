class Solution {
    /*
     * This is an O(N) solution because I am iterating through the original linkedlist twice
     * The first time I am adding each seen Node into a hashmap so I can associate it with a new Node
     * then the second loop is taking those nodes and forming them into a list and also setting their
     * random pointer to some existing value in the map
     */
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap<Node, Node> map = new HashMap();
        Node iterator = head;

        while (iterator != null)
            {
            map.put(iterator, new Node(iterator.val));
            iterator = iterator.next;
            }
        
        iterator = head;
        Node secondHead = map.get(head); secondHead.random = map.get(head.random); 
        Node secondIterator = secondHead; iterator = iterator.next;
        while (iterator != null)
        {
            secondIterator.next = map.get(iterator);
            secondIterator.next.random = map.get(iterator.random);
            secondIterator = secondIterator.next;
            iterator = iterator.next;
        }
        return secondHead;
    }
}
copyListwithRandomPointer medium O(N)
