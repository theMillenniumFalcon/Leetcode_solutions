class Solution {
    public void deleteNode(ListNode node) {
        if(node == null) {
            return;
        }

        ListNode next = node.next; 
        ListNode pre = null;
	
        while(node.next != null) {
            node.val = next.val;
            pre = node;
            node = node.next;
            next = next.next;
        }
        pre.next = null;
    }
}