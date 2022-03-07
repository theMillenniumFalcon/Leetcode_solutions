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

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode headOdd = head;
        ListNode headEven = head.next;
        ListNode dummy_even = headEven;

        while (headEven != null && headEven.next != null) {
            headOdd.next = headEven.next;
            headOdd = headOdd.next;
            headEven.next = headOdd.next;
            headEven = headEven.next;
        }

        headOdd.next = dummy_even;
        return head;
    }
}