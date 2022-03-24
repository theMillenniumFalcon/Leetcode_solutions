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

    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        ListNode newIt = dummyHead;
        ListNode it = head;

        while (it != null) {
            it = it.next;
            int sum = 0;

            while (it != null && it.val != 0) {
                sum += it.val;
                it = it.next;
            }

            if (sum != 0) {
                newIt.next = new ListNode(sum);
                newIt = newIt.next;
            }
        }

        return dummyHead.next;
    }
}