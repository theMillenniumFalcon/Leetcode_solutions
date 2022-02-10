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

    public int getDecimalValue(ListNode head) {
        int result = head.val;
        while (head.next != null) {
            result = result * 2 + head.next.val;
            head = head.next;
        }
        return result;
    }
}