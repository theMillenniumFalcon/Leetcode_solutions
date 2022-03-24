public class main {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);

        return merge(left_side, right_side);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode sorted_temp = new ListNode(0);
        ListNode current_node = sorted_temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current_node.next = list1;
                list1 = list1.next;
            } else {
                current_node.next = list2;
                list2 = list2.next;
            }

            current_node = current_node.next;
        }

        if (list1 != null) {
            current_node.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            current_node.next = list2;
            list2 = list2.next;
        }

        return sorted_temp.next;
    }
}
